package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.l0 f88214d;

    public k0(com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var) {
        this.f88214d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.report.quality.l0 l0Var = this.f88214d;
        com.tencent.mm.plugin.appbrand.o6 runtime = l0Var.f88217a.getRuntime();
        if (runtime != null) {
            com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = runtime.R2;
            com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var = h1Var == null ? null : h1Var.f88202d;
            if (d1Var != null) {
                com.tencent.mm.plugin.appbrand.page.n7 page = l0Var.f88217a;
                kotlin.jvm.internal.o.g(page, "page");
                if (!d1Var.f88163b || d1Var.c(page)) {
                    return;
                }
                d1Var.b(page, com.tencent.mm.plugin.appbrand.report.quality.j0.f88211f, d1Var.f88167f);
            }
        }
    }
}
