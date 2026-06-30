package n34;

/* loaded from: classes4.dex */
public class r4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47 c6099xc95a2e47 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        boolean z17 = false;
        if (!(c6099xc95a2e47 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6099xc95a2e47)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.SnsSyncListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        } else if (gm0.j1.a()) {
            if (c6099xc95a2e47.f136376g.f90144a == 2) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(68377, null);
                int f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a()).f();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && f17 == 0) {
                    z17 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSyncListener", "Strategy 3 isNotExistSnsNew %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3(256));
                }
            } else {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3(256));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsSyncListener", "SnsSyncEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsSyncListener");
        return z17;
    }
}
