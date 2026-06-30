package c01;

/* loaded from: classes11.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f37261a;

    /* renamed from: b, reason: collision with root package name */
    public static long f37262b;

    /* renamed from: c, reason: collision with root package name */
    public static long f37263c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f37264d;

    static {
        hq.d.f282963a = new c01.hd();
        f37262b = -1L;
        f37263c = -1L;
        f37264d = new java.lang.Object();
    }

    public static long a() {
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.h() && gm0.j1.i().f273218k) {
            gm0.j1.i();
            if (gm0.j1.b().m()) {
                try {
                    return c();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TimeHelper", th6.getMessage());
                    return 0L;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeHelper", "account error");
        return 0L;
    }

    public static long b() {
        try {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = com.tencent.mm.sdk.platformtools.o4.M("time").getLong("client_server_elapsed_time_long", elapsedRealtime);
            long j18 = com.tencent.mm.sdk.platformtools.o4.M("time").getLong("client_server_time_long", 0L);
            return 0 < j18 ? j18 + java.lang.Math.max(0L, elapsedRealtime - j17) : java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeHelper", "getCurrentServerTimeNoMMProcess %s", th6.getMessage());
            return java.lang.System.currentTimeMillis();
        }
    }

    public static long c() {
        long max;
        if (!f37261a) {
            return java.lang.System.currentTimeMillis();
        }
        synchronized (f37264d) {
            max = f37262b + java.lang.Math.max(0L, android.os.SystemClock.elapsedRealtime() - f37263c);
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
        synchronized (f37264d) {
            if (f37261a) {
                f37262b = java.lang.Math.max(j17, c());
            } else {
                f37262b = j17;
            }
            f37263c = android.os.SystemClock.elapsedRealtime();
            f37261a = true;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("time");
        M.getClass();
        M.putLong("client_server_time_long", f37262b);
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("time");
        M2.getClass();
        M2.putLong("client_server_elapsed_time_long", f37263c);
    }
}
