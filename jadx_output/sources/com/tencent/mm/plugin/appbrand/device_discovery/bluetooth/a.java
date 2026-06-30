package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 f77863a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f77864b = new android.util.ArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f77865c = new android.util.ArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f77866d = new java.util.ArrayList();

    public a(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var) {
        this.f77863a = k0Var;
    }

    public static boolean a() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a$$b
            @Override // com.tencent.mm.ipcinvoker.r
            public final void a(java.lang.Object obj) {
                atomicBoolean.set(((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d);
                countDownLatch.countDown();
            }
        });
        return atomicBoolean.get();
    }

    public final boolean b() {
        synchronized (this) {
            java.util.Iterator it = ((java.util.ArrayList) this.f77866d).iterator();
            while (it.hasNext()) {
                if (android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) it.next()).longValue() >= 3600000) {
                    it.remove();
                }
            }
            if (((java.util.ArrayList) this.f77866d).size() < 5) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBleKeepAlive", "start app limited by frequency");
            return false;
        }
    }

    public void c(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(str + i17 + str2), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d.class, new n91.g$$a());
    }

    public void d(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(str + i17 + str2), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e.class, new n91.g$$a());
    }
}
