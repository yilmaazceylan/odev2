package intro;

public class main {

	public static void main(String[] args) {
		System.out.println("hello world!");
	
		// değişken isimlendirmeleri java'da camelCase yazılır
		String ortaMetin ="ilginizi çekebilir";
		String altMetin ="vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		
		double dolarDun = 18.25;
		double dolarBugun =18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = ""; 
             
		if (dolarBugun<dolarDun) { // false
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
            System.out.println(okYonu);
		}	
		 else {
			 okYonu = "equal.svg";
	         System.out.println(okYonu);
		}
		
		// array
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbantan Alanlar","Mutlu Emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
	
	

}
