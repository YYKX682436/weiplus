package e04;

/* loaded from: classes.dex */
public abstract class x0 {
    public static final void a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBarcodeJumpResultReporter", "reportBarcodeJumpResult respType: " + i17 + ", xmlType: " + i18 + ", codeContent: " + str + ", codeName: " + str2 + ", extraInfo: " + str3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        objArr[2] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        objArr[4] = str3;
        g0Var.d(36754, objArr);
    }
}
