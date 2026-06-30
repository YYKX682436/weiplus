package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class c6 {
    public static void a(int i17, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        if (appBrandInitConfigWC == null) {
            return;
        }
        b(i17, appBrandInitConfigWC.f77278d, appBrandInitConfigWC.L, appBrandInitConfigWC.f77281g, appBrandInitConfigWC.f47284z);
    }

    public static void b(int i17, java.lang.String str, int i18, int i19, int i27) {
        c(i17, str, i18, i19, k91.l3.a(i27));
    }

    public static void c(int i17, java.lang.String str, int i18, int i19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeStartupReporter", "reportStartupIDKEY, key:%d, appId:%s, appVersion:%d, versionType:%d, isGame:%b", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = z17 ? ib1.h.CTRL_INDEX : 369;
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(i27, i17, 1L, false);
            com.tencent.mm.plugin.appbrand.report.v0.i(str, i18, i19, i27, i17, 1);
        } catch (java.lang.Exception unused) {
        }
    }
}
