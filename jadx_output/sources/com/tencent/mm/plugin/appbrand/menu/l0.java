package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class l0 extends nh1.a {
    public l0() {
        super(3);
    }

    public static com.tencent.mm.plugin.appbrand.menu.v0 d(android.content.Context context, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        if (E0 != null && k91.a.f305521e.a(E0) == 1) {
            return com.tencent.mm.plugin.appbrand.menu.v0.HIDDEN;
        }
        if (e(n7Var)) {
            java.util.Map map = i81.j.f289592a;
            if (!(context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI) && !wa1.b.a(n7Var.getRuntime())) {
                return com.tencent.mm.plugin.appbrand.menu.v0.SHOW_CLICKABLE;
            }
        }
        return com.tencent.mm.plugin.appbrand.menu.v0.SHOW_UNCLICKABLE;
    }

    public static boolean e(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        if ((E0 != null && E0.f305852r.f75399d == 0 && k91.a.f305521e.a(E0) == 2) || n7Var.H1(3) == null) {
            return false;
        }
        return !n7Var.H1(3).f85995c;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        int ordinal = d(context, (com.tencent.mm.plugin.appbrand.page.n7) v5Var).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            g4Var.j(this.f337084a, context.getString(com.tencent.mm.R.string.a2w), com.tencent.mm.R.raw.icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m), true);
        } else {
            g4Var.h(this.f337084a, context.getString(com.tencent.mm.R.string.a2w), com.tencent.mm.R.raw.icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 39, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        com.tencent.mm.plugin.appbrand.weishi.c.a(n7Var.getRuntime());
        com.tencent.mm.plugin.appbrand.menu.z0.b(context, n7Var, u0Var, null);
    }
}
