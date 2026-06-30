package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i f242655d = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        v24.g gVar = v24.g.f514451a;
        boolean z18 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ColorfulQRConfig").getBoolean("focusDisable", false)) {
            z17 = false;
        } else {
            z17 = !(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_colorful_qrcode_disable_locally_generated, 0) == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ColorfulQRConfig", "canUseQRCodeLocallyGenerated: " + z17);
        }
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("LocalGenFinishSuccess").getBoolean("LocalGenFinishSuccess".concat(gVar.a()), true)) {
            z18 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseColorfulSelfQRCodeUIC", "init useLocalGenQR: " + valueOf.booleanValue());
        return valueOf;
    }
}
