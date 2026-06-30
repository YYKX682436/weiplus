package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public abstract class m {
    public static final boolean a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config, java.lang.Integer num, java.lang.String str, int i17) {
        boolean isTeenMode;
        kotlin.jvm.internal.o.g(config, "config");
        if (config.f47284z == 7 || config.f77292e2 || !(isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode())) {
            return true;
        }
        int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeUtils", "canLaunchAppBrand isTeenMode: %b, miniProgramOption: %d, serviceType: %d, isPluginApp: %b", java.lang.Boolean.valueOf(isTeenMode), java.lang.Integer.valueOf(hd6), java.lang.Integer.valueOf(config.f47284z), java.lang.Boolean.valueOf(config.f77292e2));
        if (hd6 != 0) {
            return hd6 != 2;
        }
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        if (str == null) {
            str = "";
        }
        return z5Var.m2(str, i17);
    }
}
