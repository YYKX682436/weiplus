package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class s0 extends nh1.a {
    static {
        new com.tencent.mm.plugin.appbrand.menu.q0(null);
    }

    public s0() {
        super(34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if ((r4.length() == 0) != false) goto L32;
     */
    @Override // nh1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r7, com.tencent.mm.plugin.appbrand.page.v5 r8, db5.g4 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.menu.s0.a(android.content.Context, com.tencent.mm.plugin.appbrand.page.v5, db5.g4, java.lang.String):void");
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MenuDelegate_TradeComplaint", "performItemClick");
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var != null) {
            l81.b1 b1Var = new l81.b1();
            com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
            b1Var.f317032k = runtime != null && true == runtime.r2() ? 1085 : com.tencent.mm.plugin.appbrand.ad.jsapi.r.CTRL_INDEX;
            b1Var.f317012a = "gh_af04e9bb7e91@app";
            java.lang.String format = java.lang.String.format("/complaint/pages/addComplaint/addComplaint.html?guarantee=0&self=1&entry=native&scene=1000&appid=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            b1Var.f317022f = format;
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        }
        com.tencent.mm.plugin.appbrand.report.v0.e(pageView.getAppId(), pageView.X1(), 51, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
