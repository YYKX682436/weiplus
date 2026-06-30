package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.d1 f88352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f88353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.j0 f88354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f88355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.l0 f88356h;

    public u0(com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var) {
        this.f88352d = d1Var;
        this.f88353e = n7Var;
        this.f88354f = j0Var;
        this.f88355g = bitmap;
        this.f88356h = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var = this.f88354f;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f88353e;
        try {
            com.tencent.mm.plugin.appbrand.report.quality.d1.a(this.f88352d, n7Var, j0Var, this.f88355g, this.f88356h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.QualityPageWhiteScreenDetector", "checkContentSnapshotIsBlank(page:" + n7Var.X1() + "), scene:" + j0Var + ", failed " + e17);
        }
    }
}
