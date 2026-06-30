package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1 f172270a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f172271b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f172272c = {com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274593h, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274594i, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274595j};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f172273d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f172274e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f172275f;

    static {
        java.lang.String a17 = bm5.f1.a();
        f172273d = "V8ConsecutiveCrash#StartTimeMills_" + a17;
        f172274e = "V8ConsecutiveCrash#NotCrash_" + a17;
        f172275f = "V8ConsecutiveCrash#Count_" + a17;
    }

    public final void a(long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17;
        if (f172271b.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8CrashMonitor", "enable");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
            java.lang.String str = f172273d;
            long j18 = a18 != null ? a18.getLong(str, 0L) : 0L;
            if (currentTimeMillis - j18 > j17) {
                b(0);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = q0Var.a();
            java.lang.String str2 = f172274e;
            if (a19 != null ? a19.getBoolean(str2, true) : true) {
                b(0);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = q0Var.a();
            if (((a27 != null ? a27.getInt(f172275f, 0) : 0) == 0 || 0 == j18) && (a17 = q0Var.a()) != null) {
                a17.B(str, currentTimeMillis);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = q0Var.a();
            if (a28 != null) {
                a28.G(str2, true);
            }
            com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.i1());
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.A(f172275f, i17);
        }
    }
}
