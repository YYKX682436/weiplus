package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class c0 extends nh1.a {
    public c0() {
        super(27);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.util.Map map = i81.j.f289592a;
        if (context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI) {
            return;
        }
        boolean b17 = k01.j.f303039a.b(null, str);
        int i17 = this.f337084a;
        if (b17) {
            if (g4Var != null) {
                g4Var.g(i17, context.getString(com.tencent.mm.R.string.f490255nj), com.tencent.mm.R.raw.icons_outlined_refresh);
            }
        } else if (g4Var != null) {
            g4Var.g(i17, context.getString(com.tencent.mm.R.string.f490256pq), com.tencent.mm.R.raw.icons_outlined_refresh);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mm.plugin.appbrand.report.v0.e(pageView.getAppId(), pageView.X1(), 40, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        if (pageView.getRuntime().q2()) {
            int i17 = hx5.c.f285706a;
            if (ix5.h.f295631b.e()) {
                com.tencent.mm.plugin.appbrand.app.r0.b((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) context, null);
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.menu.b0 b0Var = new com.tencent.mm.plugin.appbrand.menu.b0(pageView);
        com.tencent.mm.plugin.appbrand.na naVar = pageView.getRuntime().J2;
        com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
        kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
        if (naVar.a(runtime, false, b0Var)) {
            return;
        }
        b0Var.run();
    }
}
