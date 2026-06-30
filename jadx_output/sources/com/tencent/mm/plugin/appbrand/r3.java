package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r3 implements com.tencent.mm.plugin.appbrand.ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.s3 f87750a;

    public r3(com.tencent.mm.plugin.appbrand.s3 s3Var) {
        this.f87750a = s3Var;
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f87750a.f88447f.f89263a;
        j3Var.h("reportXWebPreInit mProcessExpired[%b]", java.lang.Boolean.valueOf(j3Var.f78452d));
        if (this.f87750a.f88447f.f89263a.f78452d) {
            return;
        }
        this.f87750a.f88445d.resume();
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.n(false, this.f87750a.f88447f.f89263a.f78450b.f74803n, this.f87750a.f88446e, com.tencent.mm.plugin.appbrand.report.l1.a(null));
            com.tencent.mm.plugin.appbrand.performance.m.e(this.f87750a.f88447f.f89263a.f78450b.f74803n, "Native", "X5Prepare", "X", this.f87750a.f88446e, java.lang.System.currentTimeMillis(), null);
        } catch (java.lang.Throwable th6) {
            this.f87750a.f88447f.f89263a.g("reportXWebPreInit exception stack %s", android.util.Log.getStackTraceString(th6));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void b() {
        com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f87750a.f88447f.f89263a.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareWebView);
        a();
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void d() {
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f87750a.f88447f.f89263a.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepPrepareWebView);
        a();
    }
}
