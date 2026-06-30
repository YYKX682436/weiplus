package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public final class n0 extends nh1.a {
    public n0() {
        super(4);
    }

    public static boolean d(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        return (n7Var.H1(4) == null || n7Var.H1(4).f85995c || wa1.b.a(n7Var.getRuntime())) ? false : true;
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        boolean z18 = E0 == null || n7Var.getF147807d() == null || (E0.f47294p0 & 64) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_ShareToTimeline", "isShow isPermissionDenied:%b", java.lang.Boolean.valueOf(z18));
        if (!z18) {
            int i17 = this.f337084a;
            java.lang.String string = context.getString(com.tencent.mm.R.string.a2x);
            if (d(n7Var) && !wa1.b.a(n7Var.getRuntime())) {
                java.util.Map map = i81.j.f289592a;
                if (!(context instanceof com.tencent.mm.plugin.appbrand.ad.ui.AppBrandAdUI)) {
                    z17 = false;
                    g4Var.j(i17, string, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
                }
            }
            z17 = true;
            g4Var.j(i17, string, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_ShareToTimeline", "performItemClick");
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = n7Var.getRuntime().E0();
        com.tencent.mm.plugin.appbrand.menu.m0 m0Var = new com.tencent.mm.plugin.appbrand.menu.m0();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String J1 = n7Var.J1();
        if (com.tencent.mm.sdk.platformtools.t8.K0(J1)) {
            J1 = E0.f305841d;
        }
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, J1);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n7Var.Y1());
        m0Var.v(n7Var.getRuntime().C0(), n7Var.getComponentId());
        m0Var.t(hashMap);
        m0Var.m();
        com.tencent.mm.plugin.appbrand.report.v0.e(str, n7Var.X1(), 41, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
