package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public final class z5 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 implements java.io.Serializable {
    public final android.content.Context B;
    public final ab4.t0 C;
    public p3325xe03a0797.p3326xc267989b.y0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(android.content.Context context, ab4.t0 mBtnInfo, android.view.ViewGroup viewGroup) {
        super(context, mBtnInfo, viewGroup);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mBtnInfo, "mBtnInfo");
        this.B = context;
        this.C = mBtnInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
        super.L();
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.D;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.D;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.D = p3325xe03a0797.p3326xc267989b.z0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1903, 0);
        java.lang.String str2 = this.C.f84425z1;
        java.lang.String str3 = str2 == null ? "" : str2;
        this.f246919t.b("jumpKefuUrl", str3);
        android.content.Context context = this.B;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
            return;
        }
        ab4.n0 u17 = u();
        java.lang.String o17 = u17 != null ? u17.o() : null;
        if (o17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageJumpKefuBtnComp", "uxinfo is null!");
            str = "";
        } else {
            str = o17;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = this.D;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y5(context, str3, str, this, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageJumpKefuBtnComp");
    }
}
