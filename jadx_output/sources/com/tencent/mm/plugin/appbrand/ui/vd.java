package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class vd {
    public static void a(android.widget.ImageView imageView) {
        java.lang.String str = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77227x0.f77242m;
        int i17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77227x0.f77243n;
        int i18 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77227x0.f77244o;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaFinancialLicenseIconApply", "applyLargeIcon w:%d, h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.ui.ae.b(imageView, com.tencent.mm.R.drawable.dag, str, i17, i18);
    }
}
