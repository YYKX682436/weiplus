package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f33381x366c91de = 760;

    /* renamed from: NAME */
    public static final java.lang.String f33382x24728b = "onSplashAdButtonClicked";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156438i = "launch";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f156439m = "close";

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        if (c0Var == null || c0Var.t3() == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f156438i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.f77502x92235c1b, str);
        java.lang.String str2 = this.f156439m;
        if (str2 == null) {
            str2 = "close";
        }
        hashMap.put("buttonType", str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEventOnSplashAdButtonClicked[AppBrandSplashAd]", "dispatch, source:%s, buttonType:%s", this.f156438i, this.f156439m);
        c0Var.t3().D2.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.f(this, hashMap, c0Var));
    }
}
