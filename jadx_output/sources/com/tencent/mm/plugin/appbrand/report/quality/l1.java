package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.n1 f88226d;

    public l1(com.tencent.mm.plugin.appbrand.report.quality.n1 n1Var, com.tencent.mm.plugin.appbrand.report.quality.j1 j1Var) {
        this.f88226d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f88226d.a();
        ((ku5.t0) ku5.t0.f312615d).l(this, this.f88226d.f88244a, "QualityKVReporter_19941");
    }
}
