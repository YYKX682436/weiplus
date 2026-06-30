package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.x2 f76039d = new com.tencent.mm.plugin.appbrand.appcache.x2();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IHugeAppBrandDataCleanupLogic.TestLogic", "run test clean logic");
        com.tencent.mm.plugin.appbrand.appcache.i3.f75588a.run();
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77216p = com.tencent.mm.plugin.appbrand.appcache.y2.f76063c;
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77215o = com.tencent.mm.plugin.appbrand.appcache.y2.f76061a;
        com.tencent.mars.xlog.Log.i("MicroMsg.IHugeAppBrandDataCleanupLogic.TestLogic", "test clean logic finished");
    }
}
