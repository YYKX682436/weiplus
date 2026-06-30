package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85006a;

    /* renamed from: b, reason: collision with root package name */
    public final l81.b1 f85007b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f85008c;

    /* renamed from: d, reason: collision with root package name */
    public final l81.v0 f85009d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85010e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f85011f;

    public k0(int i17, l81.b1 bundle, yz5.q qVar, l81.v0 v0Var, boolean z17, com.tencent.luggage.sdk.launching.p wxaColdStartMode) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        kotlin.jvm.internal.o.g(wxaColdStartMode, "wxaColdStartMode");
        this.f85006a = i17;
        this.f85007b = bundle;
        this.f85008c = qVar;
        this.f85009d = v0Var;
        this.f85010e = z17;
        this.f85011f = wxaColdStartMode;
    }

    public final void a() {
        try {
            com.tencent.mm.plugin.appbrand.launching.g5.f84619a.a(this.f85007b);
            if (this.f85011f != com.tencent.luggage.sdk.launching.p.PRE_RENDER) {
                com.tencent.luggage.sdk.launching.p pVar = com.tencent.luggage.sdk.launching.p.HEADLESS;
            }
        } catch (java.lang.Exception e17) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.PreRenderPreconditionProcess", e17, "start()", new java.lang.Object[0]);
            l81.v0 v0Var = this.f85009d;
            if (v0Var != null) {
                l81.v0.b(v0Var, -1, null, 2, null);
            }
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel g17 = com.tencent.mm.plugin.appbrand.launching.g5.f84619a.g(this.f85007b);
        g17.P = this.f85011f;
        g17.d();
        java.lang.String str2 = this.f85007b.f317014b;
        boolean z17 = true;
        java.lang.String f17 = !(str2 == null || str2.length() == 0) ? this.f85007b.f317014b : com.tencent.mm.plugin.appbrand.launching.precondition.e0.f(g17);
        java.lang.String f18 = com.tencent.mm.plugin.appbrand.report.quality.u.f(g17, f17, false);
        if (f17 != null && f17.length() != 0) {
            z17 = false;
        }
        if (!z17 && com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f85007b.f317016c)) {
            com.tencent.mm.plugin.appbrand.task.h0 h0Var = com.tencent.mm.plugin.appbrand.task.u0.f89199h;
            com.tencent.mm.plugin.appbrand.task.u0 a17 = h0Var.a();
            kotlin.jvm.internal.o.d(f17);
            com.tencent.luggage.sdk.processes.s c17 = a17.c(f17, this.f85007b.f317016c);
            if (c17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreRenderPreconditionProcess", "start(), requestId:" + this.f85006a + ", appId:" + f17 + ", task already alive");
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = c17.f47687d;
                kotlin.jvm.internal.o.e(appBrandInitConfig, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC");
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig;
                g17.b(appBrandInitConfigWC);
                appBrandInitConfigWC.S = g17.f84918u;
                appBrandInitConfigWC.V = g17.f84920w;
                appBrandInitConfigWC.f77303p2 = g17.G;
                appBrandInitConfigWC.f77311x2 = g17.N;
                com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = g17.f84914q;
                appBrandInitConfigWC.N1 = launchParamsOptional != null ? launchParamsOptional.f70419h : 0;
                appBrandInitConfigWC.H = launchParamsOptional != null ? launchParamsOptional.f70421m : null;
                appBrandInitConfigWC.K1 = g17.F;
                appBrandInitConfigWC.f77298k2 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(f18, appBrandInitConfigWC, g17.f84910o, com.tencent.mm.plugin.appbrand.report.quality.u.d());
                appBrandInitConfigWC.i(f18);
                appBrandInitConfigWC.f77298k2.f88141n = false;
                appBrandInitConfigWC.S1 = false;
                appBrandInitConfigWC.E1 = g17.R;
                appBrandInitConfigWC.H1 = j65.e.b();
                appBrandInitConfigWC.I1 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                com.tencent.mm.plugin.appbrand.launching.g0.a(appBrandInitConfigWC, g17.f84910o);
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj = g17.f84910o;
                kotlin.jvm.internal.o.f(statObj, "statObj");
                h0Var.a().H(f17, new com.tencent.mm.plugin.appbrand.task.a1(appBrandInitConfigWC, statObj, null), new com.tencent.mm.plugin.appbrand.launching.precondition.h0(appBrandInitConfigWC, this, g17));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreRenderPreconditionProcess", "start(), requestId:" + this.f85006a + ", appId:" + f17 + ", task not alive");
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.appbrand.launching.precondition.d0(this.f85006a, g17, f18, new com.tencent.mm.plugin.appbrand.launching.precondition.j0(this), this.f85009d, this.f85010e, this.f85011f));
    }
}
