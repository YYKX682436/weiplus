package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class c4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f77029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f77030b;

    public c4(com.tencent.mm.plugin.appbrand.j3 j3Var, java.lang.String str) {
        this.f77030b = j3Var;
        this.f77029a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (this.f77030b.f78452d) {
            this.f77030b.g("tryGetProcessPreloadedPageView process EXPIRED, hasWaited[%b]", bool);
            return null;
        }
        com.tencent.mm.plugin.appbrand.task.x0 x0Var = com.tencent.mm.plugin.appbrand.task.x0.WASERVICE;
        com.tencent.mm.plugin.appbrand.task.b0 b0Var = com.tencent.mm.plugin.appbrand.task.r.f89160a;
        iz5.a.e(x0Var, com.tencent.mm.plugin.appbrand.task.x0.NIL);
        java.util.Queue queue = (java.util.Queue) com.tencent.mm.plugin.appbrand.task.r.f89162c.get(x0Var);
        if (queue == null || queue.isEmpty()) {
            n7Var = null;
        } else {
            n7Var = (com.tencent.mm.plugin.appbrand.page.n7) queue.poll();
            iz5.a.g(null, queue.isEmpty());
        }
        com.tencent.mm.plugin.appbrand.j3 j3Var = this.f77030b;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = bool;
        objArr[1] = java.lang.Boolean.valueOf(n7Var != null);
        j3Var.h("tryGetProcessPreloadedPageView hasWaited[%b] loaded[%b]", objArr);
        if (n7Var == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f77030b.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
        }
        if (this.f77030b.f78450b.S2(false) == null) {
            km5.u.b().a(new java.lang.RuntimeException("Runtime.getLibReader() == NULL"));
            n7Var.h();
            return null;
        }
        boolean z17 = n7Var.x().compareTo(this.f77030b.f78450b.S2(false)) == 0;
        this.f77030b.h("tryGetProcessPreloadedPageView process preloaded, hasWaited[%b] commLibMatched[%b]", bool, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            n7Var.h();
            com.tencent.mm.plugin.appbrand.keylogger.w.b(this.f77030b.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
            return null;
        }
        com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f77030b.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
        try {
            com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f77029a, true).E = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadOnProcessCreated;
        } catch (java.lang.Exception unused) {
            this.f77030b.g("tryGetProcessPreloadedPageView process preloaded but get NULL session", new java.lang.Object[0]);
        }
        return n7Var;
    }
}
