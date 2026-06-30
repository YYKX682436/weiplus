package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 f159396a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f159397b = new android.util.ArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f159398c = new android.util.ArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f159399d = new java.util.ArrayList();

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 k0Var) {
        this.f159396a = k0Var;
    }

    public static boolean a() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.a$$b
            @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
            public final void a(java.lang.Object obj) {
                atomicBoolean.set(((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj).f149933d);
                countDownLatch.countDown();
            }
        });
        return atomicBoolean.get();
    }

    public final boolean b() {
        synchronized (this) {
            java.util.Iterator it = ((java.util.ArrayList) this.f159399d).iterator();
            while (it.hasNext()) {
                if (android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) it.next()).longValue() >= 3600000) {
                    it.remove();
                }
            }
            if (((java.util.ArrayList) this.f159399d).size() < 5) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBleKeepAlive", "start app limited by frequency");
            return false;
        }
    }

    public void c(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str + i17 + str2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d.class, new n91.C29192x2f5e1a());
    }

    public void d(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str + i17 + str2), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.e.class, new n91.C29192x2f5e1a());
    }
}
