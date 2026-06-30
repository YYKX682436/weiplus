package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class f extends nh1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.e f85950b = new com.tencent.mm.plugin.appbrand.menu.e();

    public f() {
        super(0);
    }

    @Override // nh1.a
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, db5.g4 g4Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = ((com.tencent.mm.plugin.appbrand.page.n7) v5Var).getRuntime().E0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = E0.X;
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_CopyPath", "current time = %d , expire time = %d, time interval in seconds = %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf((j17 - currentTimeMillis) / 1000));
        int ordinal = (!((java.lang.System.currentTimeMillis() > j17 ? 1 : (java.lang.System.currentTimeMillis() == j17 ? 0 : -1)) > 0) ? com.tencent.mm.plugin.appbrand.menu.v0.SHOW_CLICKABLE : com.tencent.mm.plugin.appbrand.menu.v0.HIDDEN).ordinal();
        int i17 = this.f337084a;
        if (ordinal == 1) {
            g4Var.g(i17, context.getString(com.tencent.mm.R.string.f490086ki), com.tencent.mm.R.raw.app_brand_menu_copy_path);
        } else {
            if (ordinal != 2) {
                return;
            }
            g4Var.l(i17, context.getString(com.tencent.mm.R.string.f490086ki), com.tencent.mm.R.raw.app_brand_menu_copy_path, true);
        }
    }

    @Override // nh1.a
    public void c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        com.tencent.mm.plugin.appbrand.menu.e eVar = f85950b;
        eVar.f85947a = str;
        eVar.f85948b = n7Var.X1();
        com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.b(com.tencent.mm.plugin.appbrand.jsapi.d1.f80732e, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, eVar);
        new com.tencent.mm.plugin.appbrand.jsapi.t0(false).x(n7Var.getComponentId(), n7Var.U1());
    }
}
