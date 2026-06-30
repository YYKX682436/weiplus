package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f33393x366c91de = 1166;

    /* renamed from: NAME */
    public static final java.lang.String f33394x24728b = "resizeSplashAd";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156457i = "launch";

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, int[] iArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f156457i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.f77502x92235c1b, str);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int e17 = ik1.w.e(i17);
        int e18 = ik1.w.e(i18);
        int e19 = ik1.w.e(ym5.x.a(e9Var.getF229340d(), 8.0f) + be1.f0.E(e9Var));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(e17));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(e18));
        hashMap.put("rightButtonTop", java.lang.Integer.valueOf(e19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiResizeSplashAd", "dispatch, screenWidth:%s, screenHeight:%s,  rightButtonTop:%s", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(e18), java.lang.Integer.valueOf(e19));
        t(hashMap);
        u(e9Var);
        n(c0Var);
    }
}
