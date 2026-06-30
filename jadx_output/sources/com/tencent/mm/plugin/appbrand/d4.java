package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f77564a;

    public d4(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f77564a = j3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        final km5.b c17 = km5.u.c();
        boolean o17 = com.tencent.mm.plugin.appbrand.task.r.o(com.tencent.mm.plugin.appbrand.task.x0.WASERVICE, 2, new com.tencent.mm.plugin.appbrand.task.d0() { // from class: com.tencent.mm.plugin.appbrand.d4$$a
            @Override // com.tencent.mm.plugin.appbrand.task.d0
            public final void onReady() {
                km5.b.this.c(java.lang.Boolean.TRUE);
            }
        }, "AppBrandRuntimeBoostStrategy.tryGetProcessPreloadedPageView");
        this.f77564a.h("tryGetProcessPreloadedPageView shouldWait[%b]", java.lang.Boolean.valueOf(o17));
        if (o17) {
            com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f77564a.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
        } else {
            c17.c(java.lang.Boolean.FALSE);
        }
        return java.lang.Boolean.valueOf(o17);
    }
}
