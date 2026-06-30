package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f88360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.d1 f88361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.j0 f88362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.l0 f88363g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var, com.tencent.mm.plugin.appbrand.report.quality.j0 j0Var, com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var) {
        super(1);
        this.f88360d = n7Var;
        this.f88361e = d1Var;
        this.f88362f = j0Var;
        this.f88363g = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            (this.f88360d.getRuntime().S ? (java.util.concurrent.Executor) ((jz5.n) this.f88361e.f88168g).getValue() : (java.util.concurrent.Executor) ((jz5.n) this.f88361e.f88169h).getValue()).execute(new com.tencent.mm.plugin.appbrand.report.quality.u0(this.f88361e, this.f88360d, this.f88362f, bitmap, this.f88363g));
        }
        return jz5.f0.f302826a;
    }
}
