package kn4;

/* loaded from: classes12.dex */
public class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static kn4.o0 f391266d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f391267e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f391268a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public long f391269b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public long f391270c = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;

    public o0() {
        a(0, 1, 60000L, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a(0, 2, 900000L, true);
            a(0, 3, 1800000L, true);
        }
    }

    public static kn4.o0 b() {
        if (f391266d == null) {
            synchronized (kn4.o0.class) {
                if (f391266d == null) {
                    f391266d = new kn4.o0();
                }
            }
        }
        return f391266d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[Catch: all -> 0x01eb, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x006b, B:14:0x008e, B:16:0x0095, B:20:0x00a1, B:25:0x00aa, B:70:0x01ca, B:27:0x00ac, B:29:0x00bf, B:30:0x00c1, B:34:0x0147, B:42:0x016e, B:43:0x0191, B:64:0x01c8, B:65:0x0159, B:45:0x0192, B:47:0x0196, B:48:0x01aa, B:54:0x01bb, B:58:0x01c0, B:59:0x01c3, B:50:0x01ab, B:52:0x01b4, B:53:0x01ba), top: B:11:0x006b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn4.o0.c():boolean");
    }

    public void a(int i17, int i18, long j17, boolean z17) {
        kn4.g0 g0Var = new kn4.g0(new kn4.h0());
        g0Var.f391199b = j17;
        g0Var.f391200c = i17;
        g0Var.f391201d = z17;
        g0Var.f391204g = new kn4.C29036x6328ea0(this, i18);
        this.f391268a.put(java.lang.Integer.valueOf(i18), g0Var);
        long j18 = this.f391269b;
        long j19 = g0Var.f391199b;
        if (j18 < j19) {
            this.f391269b = j19;
        }
        if (this.f391270c > j19) {
            this.f391270c = j19;
        }
    }
}
