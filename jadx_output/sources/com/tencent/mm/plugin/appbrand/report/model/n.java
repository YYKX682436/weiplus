package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public abstract class n {
    public static final void a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI activity, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config, java.lang.String scene) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(scene, "scene");
        int i17 = kotlin.jvm.internal.o.b("onNewIntent", scene) ? 100 : 0;
        java.lang.String appId = config.f77278d;
        kotlin.jvm.internal.o.f(appId, "appId");
        com.tencent.mm.plugin.appbrand.report.model.k kVar = new com.tencent.mm.plugin.appbrand.report.model.k(appId, config.f77281g);
        kVar.f88010d = i17;
        kVar.f88009c.add(new com.tencent.mars.smc.IDKey(1774, kVar.f88010d + 0, 1));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        kVar.b(java.lang.System.currentTimeMillis() - config.I);
        kVar.a();
        if (kz5.z.F(tg1.n.f419143g, config.f47269b2.f87790f) || kz5.z.F(tg1.n.f419144h, config.f47269b2.f87790f)) {
            try {
                java.lang.String queryParameter = android.net.Uri.parse(config.f77283i).getQueryParameter("scancode_time");
                kotlin.jvm.internal.o.d(queryParameter);
                long parseLong = java.lang.Long.parseLong(queryParameter) * 1000;
                long b17 = c01.id.b();
                if (parseLong <= 0 || b17 <= 0) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIInvalidIntentTraceReport", "reportOnRuntimeLoad, appId:" + config.f77278d + ", appScene:" + config.f47269b2.f87790f + ", uiScene:" + scene + ", scanCodeTime:" + parseLong + ", serverSyncTime:" + b17);
                java.lang.String appId2 = config.f77278d;
                kotlin.jvm.internal.o.f(appId2, "appId");
                com.tencent.mm.plugin.appbrand.report.model.k kVar2 = new com.tencent.mm.plugin.appbrand.report.model.k(appId2, config.f77281g);
                kVar2.f88010d = i17 + 20;
                kVar2.f88009c.add(new com.tencent.mars.smc.IDKey(1774, kVar2.f88010d + 0, 1));
                long j17 = b17 - parseLong;
                kVar2.b(j17);
                kVar2.a();
                long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_ban_open_scancode_time_expired_span, 3600000L);
                if (Ui > 0 && j17 > Ui) {
                    throw new com.tencent.mm.plugin.appbrand.report.model.a();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static final void b() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getMainProcessName(...)");
        com.tencent.mm.ipcinvoker.f.a(str, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.report.model.m.f88061d, null);
    }
}
