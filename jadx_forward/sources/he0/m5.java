package he0;

/* loaded from: classes4.dex */
public class m5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d c5935xb93dc17d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5935xb93dc17d) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        if (gm0.j1.a()) {
            long j17 = c5935xb93dc17d.f136239g.f89744a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResendSnsListener", "try resend msg for SnsInfoId:%d", java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new he0.l5(this, j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ResendSnsListener", "ResendSnsEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.ResendSnsListener");
        return false;
    }
}
