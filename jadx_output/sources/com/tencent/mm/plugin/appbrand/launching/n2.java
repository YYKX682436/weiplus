package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class n2 {
    public static void a(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = o6Var.E0();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = o6Var.l2();
        com.tencent.mm.plugin.appbrand.rd rdVar = (com.tencent.mm.plugin.appbrand.rd) o6Var.f471744d2.b();
        boolean z17 = rdVar.f87765b && !rdVar.f87766c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTaskUsageRecorder", "updateUsage, appId %s, type %d, requestWithNotOpenFlagForDirectGame %b", u07.f77278d, java.lang.Integer.valueOf(u07.f77281g), java.lang.Boolean.valueOf(z17));
        new com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$UpdateTask(new com.tencent.mm.plugin.appbrand.launching.AppBrandTaskUsageRecorder$LaunchCheckParams(u07, l27, E0.f305852r.pkgVersion, u07.f47276v, u07.f77298k2, o6Var.S2(false), bm5.f1.a(), o6Var.X2, z17)).d();
    }
}
