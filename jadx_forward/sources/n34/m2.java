package n34;

/* loaded from: classes13.dex */
public class m2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416212d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416213e;

    public m2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5621x283c55b8 c5621x283c55b8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5621x283c55b8) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetSnsObjectDetailListener", "GetSnsTimeLineObjectEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        } else if (c5621x283c55b8 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5621x283c55b8) {
            this.f416212d = c5621x283c55b8.f135947g.f89152a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f416212d);
            this.f416213e = k17;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this.f416212d;
            objArr[1] = java.lang.Boolean.valueOf(k17 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsObjectDetailListener", "mLoaclId:%s mSnsInfo is null?[%b]", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f416213e;
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                if (m70371x485d7 != null) {
                    c5621x283c55b8.f135948h.f89244a = m70371x485d7;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsTimeLineObjectListener");
        return z17;
    }
}
