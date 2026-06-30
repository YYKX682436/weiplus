package he0;

/* loaded from: classes4.dex */
public class n4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.vc vcVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        if (gm0.j1.a()) {
            if (c5521xb353c3e2 != null && (vcVar = c5521xb353c3e2.f135849g) != null && vcVar.f89721a > 0) {
                ((ku5.t0) ku5.t0.f394148d).g(new he0.m4(this, c5521xb353c3e2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderPostFinishListener", "FinderPostStatusEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        return false;
    }
}
