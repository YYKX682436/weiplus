package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f88401a = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.b4 f88402b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.b4 f88403c = null;

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f88404d;

    public static void a(int i17) {
        long j17;
        long j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "startTimeCount duration:%d", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            j17 = com.tencent.mm.plugin.appbrand.report.u.f88411a;
            j18 = 1;
        } else {
            j17 = i17;
            j18 = com.tencent.mm.plugin.appbrand.report.u.f88411a;
        }
        long j19 = j17 * j18;
        e();
        f88402b = new com.tencent.mm.sdk.platformtools.b4("MicroMsg.AppBrandIDKeyBatchReport", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.appbrand.report.q(), true);
        f88402b.c(j19, j19);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.t.b():void");
    }

    public static void c(r45.uc7 uc7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "writeReportData type:%d", java.lang.Integer.valueOf(uc7Var.f387231d));
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f88401a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                byte[] byteArray = uc7Var.toByteArray();
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.mm.plugin.appbrand.report.u.b());
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.report.u.a());
                if (!r6Var.m()) {
                    r6Var.k();
                }
                int length = byteArray.length;
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                new java.io.DataOutputStream(byteArrayOutputStream).writeInt(length);
                com.tencent.mm.vfs.w6.a(com.tencent.mm.plugin.appbrand.report.u.a(), byteArrayOutputStream.toByteArray());
                com.tencent.mm.vfs.w6.a(com.tencent.mm.plugin.appbrand.report.u.a(), byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "appendToFile exception:%s", e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", e17, "", new java.lang.Object[0]);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public static void d() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f88401a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.appbrand.report.u.a());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", e17, "removeFile()", new java.lang.Object[0]);
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static void e() {
        if (f88402b != null) {
            f88402b.d();
            f88402b = null;
        }
    }
}
