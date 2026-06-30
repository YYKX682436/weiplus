package n34;

/* loaded from: classes4.dex */
public class i2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f416160d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416161e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f416162f;

    public i2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8 c5618x529c81c8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8) abstractC20979x809547d1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetSnsObjectDetailListener", "GetSnsObjectDetailEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else if (c5618x529c81c8 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8) {
            this.f416160d = c5618x529c81c8.f135943g.f88780a;
            this.f416161e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(this.f416160d);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(this.f416160d);
            objArr[1] = java.lang.Boolean.valueOf(this.f416161e == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsObjectDetailListener", "LocalId:%s mSnsInfo is null?[%b]", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f416161e;
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b226);
                if (this.f416161e.f68891x29d1292e == 0) {
                    c5618x529c81c8.f135944h.f88880a = f17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsObjectDetailListener", "[callback] local SnsObject not enable group, try request SnsObjectDetial");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2(this.f416161e.f68891x29d1292e);
                    gm0.j1.i();
                    gm0.j1.n().f354821b.a(210, this);
                    gm0.j1.i();
                    gm0.j1.n().f354821b.g(p2Var);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new n34.h2(this), false);
                    this.f416162f = b4Var;
                    b4Var.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
                }
                z17 = true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f416162f.d();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 c5943x201a82e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2();
        am.as asVar = c5943x201a82e2.f136244g;
        if (i17 == 0 && i18 == 0 && (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2)) {
            asVar.f87718a = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().s(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.p2) m1Var).J());
            c5943x201a82e2.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        } else {
            asVar.f87718a = null;
            c5943x201a82e2.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.GetSnsObjectDetailListener");
        }
    }
}
