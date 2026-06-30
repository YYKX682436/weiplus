package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f88273d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.quality.p f88274e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f88275f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.t f88276g;

    public s(com.tencent.mm.plugin.appbrand.report.quality.t tVar, com.tencent.mm.plugin.appbrand.report.quality.o oVar) {
        this.f88276g = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f88276g.f88308h == null) {
            return;
        }
        if (this.f88274e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeEventReporter", "hy: null type! could not happen");
        }
        com.tencent.mm.plugin.appbrand.report.quality.t tVar = this.f88276g;
        com.tencent.mm.plugin.appbrand.report.quality.p pVar = this.f88274e;
        boolean z17 = this.f88275f;
        synchronized (tVar) {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime = tVar.f88308h;
            if (qualitySessionRuntime != null) {
                com.tencent.mm.plugin.appbrand.report.quality.t1 b17 = com.tencent.mm.plugin.appbrand.report.quality.t.b(qualitySessionRuntime, pVar);
                if (b17 != null) {
                    com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime2 = tVar.f88308h;
                    boolean z18 = true;
                    if (!qualitySessionRuntime2.A) {
                        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.j(qualitySessionRuntime2.f88135e, b17);
                        ka1.j jVar = new ka1.j(tVar.f88308h, b17);
                        if (pVar != com.tencent.mm.plugin.appbrand.report.quality.p.Full) {
                            z18 = false;
                        }
                        jVar.a(z18);
                    } else if (z17) {
                        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.j(qualitySessionRuntime2.f88135e, b17);
                    } else {
                        ka1.j jVar2 = new ka1.j(qualitySessionRuntime2, b17);
                        if (pVar != com.tencent.mm.plugin.appbrand.report.quality.p.Full) {
                            z18 = false;
                        }
                        jVar2.a(z18);
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.report.quality.t tVar2 = this.f88276g;
        tVar2.f88301a.postDelayed(tVar2.f88302b, this.f88273d);
    }
}
