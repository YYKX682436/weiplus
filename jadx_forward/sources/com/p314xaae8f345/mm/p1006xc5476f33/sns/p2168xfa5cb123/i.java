package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackgroundVideoAggressiveCleanEventListener", "aggressiveCleanEventListener: has trigger aggressive clean");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a;
        boolean g17 = aVar.g();
        jm0.i iVar = jm0.k.f381802h;
        if (g17 || aVar.h()) {
            wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
            xVar.getClass();
            if (((zp4.c) iVar.a(zp4.c.class)).Q4() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f529986d, "exist old db need to create new db");
                ((zp4.c) iVar.a(zp4.c.class)).mo528x82b764cd();
                zp4.e.f556487a.b();
            }
        }
        ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
        if (ez0.o.f339368a.c()) {
            yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
            g8Var.getClass();
            if (((iz0.b) iVar.a(iz0.b.class)).Q4() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g8Var.f549645d, "exist old db need to create new db");
                ((iz0.b) iVar.a(iz0.b.class)).mo528x82b764cd();
                iz0.d.f377577a.b();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.statistics.SnsAggressiveCleanEventListener");
        return true;
    }
}
