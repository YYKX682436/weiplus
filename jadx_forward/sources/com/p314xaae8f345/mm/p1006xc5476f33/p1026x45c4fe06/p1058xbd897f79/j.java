package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j f159837a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.j jVar, android.os.PowerManager.WakeLock wakeLock, java.lang.String str) {
        jVar.getClass();
        if (wakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService", str + ", releaseWakeLock");
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;Ljava/lang/String;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public final android.os.PowerManager.WakeLock b(java.lang.String str) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context != null ? context.getSystemService("power") : null;
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (powerManager == null) {
            return null;
        }
        android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wx:appbrand_headless_start");
        newWakeLock.setReferenceCounted(false);
        if (!newWakeLock.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService", str + ", acquireWakeLock");
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(60000L);
            yj0.a.d(newWakeLock, aVar.b(), "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            zj0.c.f554818a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
            zj0.c.a();
            newWakeLock.acquire(longValue);
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/appbrand/headless/AppBrandHeadlessStartService", "acquireWakeLock", "(Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
        }
        return newWakeLock;
    }

    public final void c(l81.b1 bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        int hashCode = bundle.hashCode();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHeadlessStartService", "start with id:" + hashCode + ", username:" + bundle.f398545a + ", appId:" + bundle.f398547b + ", versionType:" + bundle.f398549c + ", scene:" + bundle.f398565k);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.e(hashCode, elapsedRealtime, pVar);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.k0(hashCode, bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.h(hashCode, eVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.i(eVar), false, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS).a();
    }
}
