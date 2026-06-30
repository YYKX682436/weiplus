package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static long f295484a;

    public static boolean a(int i17, int i18) {
        return i17 == 385 && (i18 == 0 || i18 == 1 || i18 == 16);
    }

    public static boolean b(int i17, int i18) {
        return i17 == 398 || (i17 == 385 && (i18 == 74 || i18 == 75)) || i17 == 1544 || i17 == 1582 || i17 == 498 || i17 == 397 || i17 == 1575 || i17 == 1639 || i17 == 556 || i17 == 422;
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        if (str3 == null || str3.length() <= 0) {
            return;
        }
        java.lang.String str5 = null;
        try {
            if (java.lang.Character.isDigit(str3.charAt(0))) {
                for (int i18 = 0; i18 < str3.length(); i18++) {
                    char charAt = str3.charAt(i18);
                    if (!java.lang.Character.isDigit(charAt) && !".".equalsIgnoreCase(java.lang.String.valueOf(charAt))) {
                        str5 = str3.substring(i18).trim();
                        str3 = str3.substring(0, i18 - 1).trim();
                    }
                }
            } else {
                for (int i19 = 0; i19 < str3.length(); i19++) {
                    char charAt2 = str3.charAt(i19);
                    if (java.lang.Character.isDigit(charAt2) || ".".equalsIgnoreCase(java.lang.String.valueOf(charAt2))) {
                        str5 = str3.substring(0, i19 - 1).trim();
                        str3 = str3.substring(i19).trim();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletReportUtil", "", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10756, str, str2, str3, str5, java.lang.Integer.valueOf(i17), str4);
    }

    public static void d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12097, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
