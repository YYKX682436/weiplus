package c01;

/* loaded from: classes11.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f118794a;

    /* renamed from: b, reason: collision with root package name */
    public static long f118795b;

    /* renamed from: c, reason: collision with root package name */
    public static long f118796c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f118797d;

    static {
        hq.d.f364496a = new c01.hd();
        f118795b = -1L;
        f118796c = -1L;
        f118797d = new java.lang.Object();
    }

    public static long a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.h() && gm0.j1.i().f354751k) {
            gm0.j1.i();
            if (gm0.j1.b().m()) {
                try {
                    return c();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeHelper", th6.getMessage());
                    return 0L;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeHelper", "account error");
        return 0L;
    }

    public static long b() {
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("time").getLong("client_server_elapsed_time_long", elapsedRealtime);
            long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("time").getLong("client_server_time_long", 0L);
            return 0 < j18 ? j18 + java.lang.Math.max(0L, elapsedRealtime - j17) : java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeHelper", "getCurrentServerTimeNoMMProcess %s", th6.getMessage());
            return java.lang.System.currentTimeMillis();
        }
    }

    public static long c() {
        long max;
        if (!f118794a) {
            return java.lang.System.currentTimeMillis();
        }
        synchronized (f118797d) {
            max = f118795b + java.lang.Math.max(0L, android.os.SystemClock.elapsedRealtime() - f118796c);
        }
        return max;
    }

    public static long d() {
        return c();
    }

    public static int e() {
        return (int) (c() / 1000);
    }

    public static long f(long j17) {
        return (c() / 1000) - j17;
    }

    public static void g(long j17) {
        synchronized (f118797d) {
            if (f118794a) {
                f118795b = java.lang.Math.max(j17, c());
            } else {
                f118795b = j17;
            }
            f118796c = android.os.SystemClock.elapsedRealtime();
            f118794a = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("time");
        M.getClass();
        M.putLong("client_server_time_long", f118795b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("time");
        M2.getClass();
        M2.putLong("client_server_elapsed_time_long", f118796c);
    }
}
