package applications;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//para guardar tamanho da matriz
		int n = sc.nextInt();
		//criando matriz de tamanho 'n'
		int[][] mat = new int[n][n];
		
		
		//percorrer a matriz e add numeros
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Main diagonal: ");
		//diagonal principal são os numeros de indice iguais
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		//contador de negativos
		int count = 0;
		
		//se o numero for negativo contador soma um
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);

		sc.close();
	}

}
