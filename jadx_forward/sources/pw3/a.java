package pw3;

/* loaded from: classes9.dex */
public abstract class a {
    public static double a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        try {
            return new java.math.BigDecimal(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new java.math.BigDecimal(str2.trim()), i17, i18).doubleValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    public static char b(java.lang.String str, char c17, boolean z17) {
        java.lang.String a17 = com.p314xaae8f345.mm.p1004x2137b148.C11326x85391f34.a(str.charAt(0));
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? z17 ? a17.toUpperCase().charAt(0) : a17.charAt(0) : c17;
    }

    public static double c(java.lang.String str, java.lang.String str2) {
        try {
            double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str, 0.0d);
            double F2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str2, 0.0d);
            if (F == 0.0d) {
                str = "0";
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
            if (F2 == 0.0d) {
                str2 = "0";
            }
            return bigDecimal.multiply(new java.math.BigDecimal(str2)).doubleValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }
}
