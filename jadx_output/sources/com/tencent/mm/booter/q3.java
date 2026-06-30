package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.TrafficStatsReceiver f63556d;

    public q3(com.tencent.mm.booter.TrafficStatsReceiver trafficStatsReceiver) {
        this.f63556d = trafficStatsReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.tencent.mm.sdk.platformtools.j8.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            com.tencent.mm.sdk.platformtools.j8.d();
        }
        com.tencent.mm.booter.TrafficStatsReceiver trafficStatsReceiver = this.f63556d;
        long j17 = trafficStatsReceiver.f63291a;
        if (j17 >= 0) {
            long j18 = elapsedRealtime - j17;
            long j19 = com.tencent.mm.sdk.platformtools.j8.f192781l;
            if (j19 <= 0) {
                j19 = 0;
            }
            long j27 = com.tencent.mm.sdk.platformtools.j8.f192780k;
            if (j27 <= 0) {
                j27 = 0;
            }
            long j28 = j19 + j27;
            long j29 = com.tencent.mm.sdk.platformtools.j8.f192783n;
            if (j29 <= 0) {
                j29 = 0;
            }
            long j37 = com.tencent.mm.sdk.platformtools.j8.f192782m;
            if (j37 <= 0) {
                j37 = 0;
            }
            long j38 = j29 + j37;
            long b17 = com.tencent.mm.sdk.platformtools.j8.b(0L);
            long j39 = com.tencent.mm.sdk.platformtools.j8.f192784o;
            if (j39 <= 0) {
                j39 = 0;
            }
            long j47 = b17 + j39;
            long b18 = com.tencent.mm.sdk.platformtools.j8.b(0L);
            long j48 = com.tencent.mm.sdk.platformtools.j8.f192784o;
            double d17 = j18 / 1000;
            com.tencent.mars.xlog.Log.i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j38), java.lang.Double.valueOf((j28 + j38) / d17), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(b18 + (j48 > 0 ? j48 : 0L)), java.lang.Double.valueOf((j47 + r14) / d17));
        }
        trafficStatsReceiver.f63291a = elapsedRealtime;
    }
}
