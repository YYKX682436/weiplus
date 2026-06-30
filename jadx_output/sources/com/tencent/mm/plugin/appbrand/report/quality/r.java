package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f88270d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.t f88271e;

    public r(com.tencent.mm.plugin.appbrand.report.quality.t tVar, com.tencent.mm.plugin.appbrand.report.quality.o oVar) {
        this.f88271e = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.report.quality.t tVar = this.f88271e;
        if (tVar.f88308h == null) {
            return;
        }
        if (tVar.f88309i) {
            com.tencent.mm.plugin.appbrand.report.quality.t tVar2 = this.f88271e;
            synchronized (tVar2) {
                if (tVar2.f88308h != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", tVar2.f88308h.f88135e + " newReport");
                    new com.tencent.mm.plugin.appbrand.report.quality.a0().a(tVar2.f88308h, tVar2.f88305e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", tVar2.f88308h.f88135e + " newReport finish");
                }
            }
        }
        com.tencent.mm.plugin.appbrand.report.quality.t tVar3 = this.f88271e;
        synchronized (tVar3) {
            if (tVar3.f88305e != null) {
                ((java.util.HashMap) tVar3.f88305e).clear();
            }
        }
        if (this.f88271e.f88310j) {
            ((ku5.t0) ku5.t0.f312615d).k(this.f88271e.f88303c, this.f88270d);
        }
    }
}
