package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f77989b;

    public e4(com.tencent.mm.plugin.appbrand.j3 j3Var, java.lang.String str) {
        this.f77989b = j3Var;
        this.f77988a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        com.tencent.mm.plugin.appbrand.task.b0 b0Var = com.tencent.mm.plugin.appbrand.task.r.f89160a;
        if (!com.tencent.xweb.WebView.y0()) {
            this.f77989b.h("doAheadPreloadPageView INTERRUPTED by kernel(%s)", com.tencent.xweb.WebView.getCurrentModuleWebCoreType().name());
            com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f77988a, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
        } else if (this.f77989b.f78452d) {
            this.f77989b.g("doAheadPreloadPageView INTERRUPTED by runtime destroyed", new java.lang.Object[0]);
        } else {
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = this.f77989b.f78450b.S2(false);
            if (S2 != null) {
                if (this.f77989b.f78450b.u0().d()) {
                    int i17 = com.tencent.mm.plugin.appbrand.app.a8.f75015a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSkylineBootGuard", "<clinit>");
                    gf.l0 l0Var = gf.l0.f271115a;
                    n7Var = (l0Var.a(S2) && l0Var.b()) ? com.tencent.mm.plugin.appbrand.page.n7.I3(this.f77989b.f78450b.M2("preload_skyline")) : new com.tencent.mm.plugin.appbrand.page.n7();
                } else {
                    n7Var = new com.tencent.mm.plugin.appbrand.page.n7();
                }
                n7Var.L0(S2);
                com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit;
                n7Var.A3(o0Var);
                try {
                    com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f77988a, true).E = o0Var;
                } catch (java.lang.Exception unused) {
                    this.f77989b.g("doAheadPreloadPageView DONE but get NULL session", new java.lang.Object[0]);
                }
                this.f77989b.h("doAheadPreloadPageView DONE", new java.lang.Object[0]);
                com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f77988a, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
                return n7Var;
            }
            this.f77989b.g("doAheadPreloadPageView get NULL LibReader from Runtime", new java.lang.Object[0]);
        }
        return null;
    }
}
