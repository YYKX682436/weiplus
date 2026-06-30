package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f89009a;

    static {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int o17 = com.tencent.mm.sdk.platformtools.o4.M("appbrand_process_force_preload").o("appbrand_process_force_preload", 0);
        if (o17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] != 1, buildConfig = [%b] reject (mmkv cost [%d]ms)", java.lang.Integer.valueOf(o17), java.lang.Boolean.FALSE, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] storage config = [%d] == 1, accepted (mmkv cost [%d]ms)", java.lang.Integer.valueOf(o17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            f89009a = true;
        }
    }

    public static final boolean a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] forcePreload = [%b]", java.lang.Boolean.valueOf(f89009a));
        return f89009a;
    }
}
