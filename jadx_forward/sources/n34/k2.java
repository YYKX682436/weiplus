package n34;

/* loaded from: classes10.dex */
public class k2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4 c5620x496bfda4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetSnsTagListListener", "GetSnsTagListEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else if (c5620x496bfda4 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4) {
            z17 = true;
            if (c5620x496bfda4.f135946g.f89065a == 0) {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(1));
            } else {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d3(c5620x496bfda4.f135946g.f89065a));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.GetSnsTagListListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTagListListener");
        return z17;
    }
}
