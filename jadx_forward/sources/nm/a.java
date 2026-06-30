package nm;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f419933a = {0, 1, 2};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f419934b = {3, 13, 23};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f419935c = {4, 14, 24};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f419936d = {5, 15, 25};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f419937e = {6, 16, 26};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f419938f = {7, 17, 27};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f419939g = {8, 18, 28};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f419940h = {9, 19, 29};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f419941i = {63, 69, 75};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f419942j = {64, 70, 76};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f419943k = {65, 71, 77};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f419944l = {66, 72, 78};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f419945m = {0};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f419946n = {3};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f419947o = {9};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f419948p = {10};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f419949q = {11};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f419950r = {12};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f419951s = {13};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f419952t = {14};

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f419953u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f419954v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static boolean f419955w = false;

    /* renamed from: x, reason: collision with root package name */
    public static long f419956x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static long f419957y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static long f419958z = 0;
    public static byte A = 0;

    public static boolean a(int i17) {
        byte b17 = A;
        if ((b17 & i17) != 0) {
            return false;
        }
        A = (byte) (b17 | i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", java.lang.Integer.valueOf(i17));
        return true;
    }

    public static void b(long j17, long j18) {
        f419953u.add(new long[]{709, j17, j18});
    }

    public static void c(int[] iArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BlinkStartup", "%s %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(j17));
        b(iArr[0], j17);
        b(iArr[1], j17);
    }

    public static void d(int[] iArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BlinkStartup", "%s %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(j17));
        f419953u.add(new long[]{910, iArr[0], j17});
    }

    public static void e(int i17) {
        if (f419958z == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f419958z;
        switch (i17) {
            case 1:
                if (a(1)) {
                    c(f419934b, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 2:
                if (a(2)) {
                    c(f419935c, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 3:
                if (a(4)) {
                    c(f419936d, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 4:
                if (a(8)) {
                    c(f419937e, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 5:
                if (a(16)) {
                    if (currentTimeMillis > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                        a(512);
                        f419955w = false;
                    }
                    c(f419938f, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            case 6:
                if (a(32)) {
                    if (currentTimeMillis > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                        a(512);
                        f419955w = false;
                    }
                    c(f419939g, currentTimeMillis);
                    f419958z = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
