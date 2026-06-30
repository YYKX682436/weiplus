package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f84995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.f f84996f;

    public i(com.tencent.mm.plugin.appbrand.launching.precondition.f fVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, java.lang.Runnable runnable) {
        this.f84996f = fVar;
        this.f84994d = appBrandInitConfigWC;
        this.f84995e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.precondition.f fVar = this.f84996f;
        com.tencent.mm.plugin.appbrand.launching.precondition.e eVar = fVar.f84980c;
        boolean k17 = eVar.f84957f.k(this.f84994d, eVar.f84955d.f84910o);
        java.lang.Runnable runnable = this.f84995e;
        if (!k17) {
            runnable.run();
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.precondition.a aVar = fVar.f84980c.f84957f;
        aVar.getClass();
        com.tencent.mm.plugin.appbrand.launching.precondition.c cVar = new com.tencent.mm.plugin.appbrand.launching.precondition.c(aVar);
        com.tencent.mm.plugin.appbrand.launching.precondition.d dVar = new com.tencent.mm.plugin.appbrand.launching.precondition.d(aVar, runnable);
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        dVar.b(cVar);
    }
}
