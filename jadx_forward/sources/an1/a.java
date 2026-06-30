package an1;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final an1.a f90363a = new an1.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f90364b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f90365c = -1;

    public final void a(int i17) {
        int i18 = f90365c;
        if (i18 == -1) {
            f90365c = i17;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            f90364b = android.os.SystemClock.elapsedRealtime();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6329xf4b4d64e c6329xf4b4d64e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6329xf4b4d64e();
        c6329xf4b4d64e.f136872d = i18;
        long j17 = f90364b;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6329xf4b4d64e.f136873e = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        c6329xf4b4d64e.k();
        f90365c = i17;
        f90364b = android.os.SystemClock.elapsedRealtime();
    }
}
