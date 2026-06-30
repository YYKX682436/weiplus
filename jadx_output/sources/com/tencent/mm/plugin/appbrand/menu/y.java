package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class y extends nh1.a {
    public y() {
        super(25);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        if ("wxae8e93bbcb785195".equals(str)) {
            return;
        }
        g4Var.g(this.f337084a, context.getString(com.tencent.mm.R.string.a2q), com.tencent.mm.R.raw.appbrand_menu_growth_care);
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wxae8e93bbcb785195";
        b1Var.f317012a = "gh_32d0f14ab3c6@app";
        b1Var.f317032k = n7Var.getRuntime().r2() ? 1085 : com.tencent.mm.plugin.appbrand.ad.jsapi.r.CTRL_INDEX;
        b1Var.f317018d = 0;
        b1Var.f317016c = 0;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 32, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
