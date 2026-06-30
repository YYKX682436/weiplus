package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.plugin.appbrand.td {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.fakenative.b f80940h = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f80941i = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.fakenative.a.f80932d);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f80942d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f80943e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80944f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.sd f80945g;

    public c(com.tencent.mm.plugin.appbrand.o6 businessViewRuntime) {
        kotlin.jvm.internal.o.g(businessViewRuntime, "businessViewRuntime");
        this.f80942d = businessViewRuntime;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs openBusinessViewExtraArgs = businessViewRuntime.u0().D.f77331p;
        this.f80943e = openBusinessViewExtraArgs != null && openBusinessViewExtraArgs.f77336d;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs openBusinessViewExtraArgs2 = businessViewRuntime.u0().D.f77331p;
        this.f80944f = openBusinessViewExtraArgs2 != null && openBusinessViewExtraArgs2.f77337e;
        mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.BusinessViewEmbeddingPage$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPaused() {
                com.tencent.mm.plugin.appbrand.sd sdVar;
                com.tencent.mm.plugin.appbrand.vc vcVar;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.c cVar = com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.this;
                if (!cVar.f80944f || (sdVar = cVar.f80945g) == null || (vcVar = ((com.tencent.mm.plugin.appbrand.wd) sdVar).f90959c) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$p) vcVar).f74837a.g0(false);
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResumed() {
                com.tencent.mm.plugin.appbrand.sd sdVar;
                com.tencent.mm.plugin.appbrand.wc wcVar;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.c cVar = com.tencent.mm.plugin.appbrand.jsapi.fakenative.c.this;
                if (!cVar.f80944f || (sdVar = cVar.f80945g) == null || (wcVar = ((com.tencent.mm.plugin.appbrand.wd) sdVar).f90958b) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o) wcVar).f74836a.j0();
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public com.tencent.mm.plugin.appbrand.w0 Cf() {
        return com.tencent.mm.plugin.appbrand.x0.d(this.f80942d.f74803n);
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void Cg(com.tencent.mm.plugin.appbrand.sd host) {
        kotlin.jvm.internal.o.g(host, "host");
        this.f80945g = host;
        com.tencent.mm.plugin.appbrand.wd wdVar = (com.tencent.mm.plugin.appbrand.wd) host;
        if (com.tencent.mm.plugin.appbrand.x0.d(wdVar.f90957a.f74803n) == com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM) {
            com.tencent.mm.plugin.appbrand.x0.g(wdVar.f90957a.f74803n, com.tencent.mm.plugin.appbrand.w0.HIDE);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public boolean D0() {
        return this.f80944f;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void Q5(com.tencent.mm.plugin.appbrand.sd host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.plugin.appbrand.sd sdVar = this.f80945g;
        iz5.a.g(null, sdVar == null || kotlin.jvm.internal.o.b(sdVar, host));
        this.f80945g = null;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.d(this.f80942d, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.DetachFromStack);
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public boolean S1() {
        return this.f80943e;
    }

    @Override // com.tencent.mm.plugin.appbrand.td
    public void bringToFront() {
        com.tencent.mm.plugin.appbrand.sd sdVar = this.f80945g;
        kotlin.jvm.internal.o.d(sdVar);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((com.tencent.mm.plugin.appbrand.wd) sdVar).f90957a;
        kotlin.jvm.internal.o.e(appBrandRuntime, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f80942d;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        u07.f47273p0 = true;
        ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u2(u07, o6Var.l2());
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.td other = (com.tencent.mm.plugin.appbrand.td) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) {
            if (kotlin.jvm.internal.o.b(this.f80942d, ((com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) other).f80942d)) {
                return 0;
            }
        }
        return hashCode() - other.hashCode();
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        androidx.lifecycle.o oVar = ((com.tencent.mm.plugin.appbrand.x2) this.f80942d.P).f92371d;
        kotlin.jvm.internal.o.f(oVar, "getLifecycle(...)");
        return oVar;
    }

    public java.lang.String toString() {
        return "BusinessViewEmbeddingPage(" + this.f80942d + ')';
    }
}
