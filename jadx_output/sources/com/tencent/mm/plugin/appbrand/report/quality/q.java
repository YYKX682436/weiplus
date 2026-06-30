package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.t f88261d;

    public q(com.tencent.mm.plugin.appbrand.report.quality.t tVar, com.tencent.mm.plugin.appbrand.report.quality.o oVar) {
        this.f88261d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.report.quality.t tVar = this.f88261d;
        if (tVar.f88308h == null) {
            return;
        }
        if (tVar.f88309i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "NewCollectionTask:" + this.f88261d.f88308h.f88135e);
            com.tencent.mm.plugin.appbrand.report.quality.t tVar2 = this.f88261d;
            synchronized (tVar2) {
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime = tVar2.f88308h;
                if (qualitySessionRuntime != null) {
                    com.tencent.mm.plugin.appbrand.report.quality.t1 b17 = com.tencent.mm.plugin.appbrand.report.quality.t.b(qualitySessionRuntime, com.tencent.mm.plugin.appbrand.report.quality.p.Light);
                    com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime2 = tVar2.f88308h;
                    java.lang.String str = qualitySessionRuntime2.f88135e;
                    tVar2.a(qualitySessionRuntime2, b17);
                    java.lang.String.valueOf(b17);
                    if (((java.util.HashMap) tVar2.f88305e).containsKey(java.lang.Integer.valueOf(tVar2.f88306f))) {
                        if (((java.util.HashMap) tVar2.f88305e).get(java.lang.Integer.valueOf(tVar2.f88306f)) != null) {
                            java.lang.String str2 = tVar2.f88308h.f88135e;
                            ((java.util.List) ((java.util.HashMap) tVar2.f88305e).get(java.lang.Integer.valueOf(tVar2.f88306f))).add(b17);
                        }
                    } else if (((java.util.HashMap) tVar2.f88305e).size() < 6) {
                        java.lang.String str3 = tVar2.f88308h.f88135e;
                        ((java.util.HashMap) tVar2.f88305e).put(java.lang.Integer.valueOf(tVar2.f88306f), new java.util.ArrayList());
                        ((java.util.List) ((java.util.HashMap) tVar2.f88305e).get(java.lang.Integer.valueOf(tVar2.f88306f))).add(b17);
                    }
                }
            }
        }
        if (this.f88261d.f88310j) {
            ((ku5.t0) ku5.t0.f312615d).k(this.f88261d.f88304d, 1000L);
        }
    }
}
