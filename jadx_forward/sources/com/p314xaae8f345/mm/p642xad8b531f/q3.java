package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes11.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.C10307xa51e28d1 f145089d;

    public q3(com.p314xaae8f345.mm.p642xad8b531f.C10307xa51e28d1 c10307xa51e28d1) {
        this.f145089d = c10307xa51e28d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.d();
        }
        com.p314xaae8f345.mm.p642xad8b531f.C10307xa51e28d1 c10307xa51e28d1 = this.f145089d;
        long j17 = c10307xa51e28d1.f144824a;
        if (j17 >= 0) {
            long j18 = elapsedRealtime - j17;
            long j19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274314l;
            if (j19 <= 0) {
                j19 = 0;
            }
            long j27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274313k;
            if (j27 <= 0) {
                j27 = 0;
            }
            long j28 = j19 + j27;
            long j29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274316n;
            if (j29 <= 0) {
                j29 = 0;
            }
            long j37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274315m;
            if (j37 <= 0) {
                j37 = 0;
            }
            long j38 = j29 + j37;
            long b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(0L);
            long j39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274317o;
            if (j39 <= 0) {
                j39 = 0;
            }
            long j47 = b17 + j39;
            long b18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.b(0L);
            long j48 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j8.f274317o;
            double d17 = j18 / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j38), java.lang.Double.valueOf((j28 + j38) / d17), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(b18 + (j48 > 0 ? j48 : 0L)), java.lang.Double.valueOf((j47 + r14) / d17));
        }
        c10307xa51e28d1.f144824a = elapsedRealtime;
    }
}
