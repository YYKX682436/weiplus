package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f264507a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.util.regex.Pattern f264508b;

    public static void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, boolean z17) {
        c22633x83752a59.mo120153xd15cf999().I(false);
        boolean z18 = !z17;
        c22633x83752a59.mo120153xd15cf999().S(z18);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_audio_autoplay, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay audioAutoPlayControl:%d, enable:%b", java.lang.Integer.valueOf(Ni), java.lang.Boolean.valueOf(z17));
        if (Ni == 1) {
            c22633x83752a59.mo120153xd15cf999().n(z18);
        }
    }

    public static void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        if (c22633x83752a59 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        java.lang.String mo120156xb5887639 = c22633x83752a59.mo120156xb5887639();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", mo120156xb5887639);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo120156xb5887639)) {
            return;
        }
        c(c22633x83752a59, mo120156xb5887639, false);
    }

    public static void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str, boolean z17) {
        if (c22633x83752a59 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.startsWith("webcompt://")) {
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.w0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j(z17, str, c22633x83752a59));
    }
}
