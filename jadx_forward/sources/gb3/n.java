package gb3;

/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f351564a;

    /* renamed from: b, reason: collision with root package name */
    public static long f351565b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f351566c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f351567d;

    public static void a(int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f351564a)) {
            return;
        }
        if (f351567d || !(i17 == 9 || i17 == 10 || i17 == 11)) {
            if (i17 == 9 || i17 == 10 || i17 == 11) {
                f351567d = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18889, java.lang.Integer.valueOf(i17), f351564a, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() / 1000) - f351565b), f351566c);
        }
    }
}
