package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class id0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f194493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f194494e;

    public id0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, boolean z17) {
        this.f194493d = nd0Var;
        this.f194494e = z17;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationCancel");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var = this.f194493d;
        nd0Var.f195158z.setVisibility(4);
        nd0Var.A.setVisibility(4);
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTitlePlugin", "[showOrDismissAnimView] onAnimationEnd");
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f194493d.G1(this.f194494e, "#5", bool, bool);
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
