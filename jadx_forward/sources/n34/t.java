package n34;

/* loaded from: classes12.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5400x2495a482 c5400x2495a482 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5400x2495a482) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "ExtStartSnsServerAndCallbackOnFpSetSizeEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        } else if (c5400x2495a482 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5400x2495a482) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
            am.s8 s8Var = c5400x2495a482.f135743g;
            Kj.w(s8Var.f89406a, s8Var.f89407b, new n34.s(this, c5400x2495a482));
            am.s8 s8Var2 = c5400x2495a482.f135743g;
            Kj.e(1, s8Var2.f89407b, s8Var2.f89408c, s8Var2.f89409d, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener");
        return z17;
    }
}
