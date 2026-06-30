package n34;

/* loaded from: classes4.dex */
public class t4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd c6111xbfced4cd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsfillEventInfoListener", "SnsfillEventInfoEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        } else if (c6111xbfced4cd instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd) {
            am.lx lxVar = c6111xbfced4cd.f136388h;
            am.kx kxVar = c6111xbfced4cd.f136387g;
            lxVar.f88810a = qb4.a.c(kxVar.f88722c, kxVar.f88720a, kxVar.f88721b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.SnsfillEventInfoListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsfillEventInfoListener");
        return z17;
    }
}
