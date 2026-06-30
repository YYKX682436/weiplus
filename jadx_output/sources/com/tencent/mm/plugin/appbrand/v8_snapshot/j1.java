package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.j1 f90737a = new com.tencent.mm.plugin.appbrand.v8_snapshot.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f90738b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f90739c = {com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.sdk.platformtools.w9.f193058f, com.tencent.mm.sdk.platformtools.w9.f193059g, com.tencent.mm.sdk.platformtools.w9.f193060h, com.tencent.mm.sdk.platformtools.w9.f193061i, com.tencent.mm.sdk.platformtools.w9.f193062j};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f90740d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f90741e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f90742f;

    static {
        java.lang.String a17 = bm5.f1.a();
        f90740d = "V8ConsecutiveCrash#StartTimeMills_" + a17;
        f90741e = "V8ConsecutiveCrash#NotCrash_" + a17;
        f90742f = "V8ConsecutiveCrash#Count_" + a17;
    }

    public final void a(long j17) {
        com.tencent.mm.sdk.platformtools.o4 a17;
        if (f90738b.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.V8CrashMonitor", "enable");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
            com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
            java.lang.String str = f90740d;
            long j18 = a18 != null ? a18.getLong(str, 0L) : 0L;
            if (currentTimeMillis - j18 > j17) {
                b(0);
            }
            com.tencent.mm.sdk.platformtools.o4 a19 = q0Var.a();
            java.lang.String str2 = f90741e;
            if (a19 != null ? a19.getBoolean(str2, true) : true) {
                b(0);
            }
            com.tencent.mm.sdk.platformtools.o4 a27 = q0Var.a();
            if (((a27 != null ? a27.getInt(f90742f, 0) : 0) == 0 || 0 == j18) && (a17 = q0Var.a()) != null) {
                a17.B(str, currentTimeMillis);
            }
            com.tencent.mm.sdk.platformtools.o4 a28 = q0Var.a();
            if (a28 != null) {
                a28.G(str2, true);
            }
            com.tencent.mm.app.i4.a(new com.tencent.mm.plugin.appbrand.v8_snapshot.i1());
        }
    }

    public final void b(int i17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.A(f90742f, i17);
        }
    }
}
