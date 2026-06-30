package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f33383x366c91de = 753;

    /* renamed from: NAME */
    public static final java.lang.String f33384x24728b = "onSplashAdClose";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156443i = "launch";

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c cVar;
        if (c0Var == null || c0Var.t3() == null || (cVar = c0Var.t3().D2) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = this.f156443i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "launch";
        }
        hashMap.put(ya.b.f77502x92235c1b, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEventOnSplashAdClosed[AppBrandSplashAd]", "dispatch, source:%s", this.f156443i);
        cVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.h(this, hashMap, c0Var));
    }
}
