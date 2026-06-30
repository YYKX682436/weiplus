package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.headless.j f78304a = new com.tencent.mm.plugin.appbrand.headless.j();

    public static final void a(com.tencent.mm.plugin.appbrand.headless.j jVar, android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        jVar.getClass();
        if (wakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService", str + ", releaseWakeLock");
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public final android.os.PowerManager.WakeLock b(java.lang.String str) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context != null ? context.getSystemService("power") : null;
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (powerManager == null) {
            return null;
        }
        android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wx:appbrand_headless_start");
        newWakeLock.setReferenceCounted(false);
        if (!newWakeLock.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService", str + ", acquireWakeLock");
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(60000L);
            yj0.a.d(newWakeLock, aVar.b(), "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            zj0.c.f473285a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
            zj0.c.a();
            newWakeLock.acquire(longValue);
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
        }
        return newWakeLock;
    }

    public final void c(l81.b1 bundle, com.tencent.mm.plugin.appbrand.headless.p pVar) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        int hashCode = bundle.hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService", "start with id:" + hashCode + ", username:" + bundle.f317012a + ", appId:" + bundle.f317014b + ", versionType:" + bundle.f317016c + ", scene:" + bundle.f317032k);
        com.tencent.mm.plugin.appbrand.headless.e eVar = new com.tencent.mm.plugin.appbrand.headless.e(hashCode, elapsedRealtime, pVar);
        new com.tencent.mm.plugin.appbrand.launching.precondition.k0(hashCode, bundle, new com.tencent.mm.plugin.appbrand.headless.h(hashCode, eVar), new com.tencent.mm.plugin.appbrand.headless.i(eVar), false, com.tencent.luggage.sdk.launching.p.HEADLESS).a();
    }
}
