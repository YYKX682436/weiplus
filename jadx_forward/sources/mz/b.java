package mz;

/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDnsCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final mz.b f414396a = new mz.b();

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDnsCallback
    public final java.lang.String[] dns(java.lang.String str) {
        java.lang.String[] strArr;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (str == null || str.length() == 0) {
            strArr = new java.lang.String[0];
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            java.lang.String PROCESS_PUSH = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_PUSH, "PROCESS_PUSH");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_PUSH, new com.p314xaae8f345.mm.ipc.C10743x8b97dbce(str, 2000, true, 0, false), new jk0.c(), new mz.a(atomicReference, countDownLatch));
            try {
                countDownLatch.await(10L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CronetSetupSplashPreloadService", "SimpleDnsCallback, await ipc result get exception:" + e17);
            }
            strArr = (java.lang.String[]) atomicReference.get();
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SimpleDnsCallback complete, ");
        sb6.append(str);
        sb6.append(" -> ");
        java.lang.String arrays = java.util.Arrays.toString(strArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", cost:");
        sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        sb6.append("ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetSetupSplashPreloadService", sb6.toString());
        return strArr;
    }
}
