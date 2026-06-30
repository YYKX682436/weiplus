package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantReadWriteLock f169934a = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f169935b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f169936c = null;

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f169937d;

    public static void a(int i17) {
        long j17;
        long j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "startTimeCount duration:%d", java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.f169944a;
            j18 = 1;
        } else {
            j17 = i17;
            j18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.f169944a;
        }
        long j19 = j17 * j18;
        e();
        f169935b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("MicroMsg.AppBrandIDKeyBatchReport", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q(), true);
        f169935b.c(j19, j19);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.b():void");
    }

    public static void c(r45.uc7 uc7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "writeReportData type:%d", java.lang.Integer.valueOf(uc7Var.f468764d));
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f169934a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                byte[] mo14344x5f01b1f6 = uc7Var.mo14344x5f01b1f6();
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.b());
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                    if (m18.a()) {
                        m18.f294799a.r(m18.f294800b);
                    }
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.a());
                if (!r6Var.m()) {
                    r6Var.k();
                }
                int length = mo14344x5f01b1f6.length;
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                new java.io.DataOutputStream(byteArrayOutputStream).writeInt(length);
                com.p314xaae8f345.mm.vfs.w6.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.a(), byteArrayOutputStream.toByteArray());
                com.p314xaae8f345.mm.vfs.w6.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.a(), mo14344x5f01b1f6);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "appendToFile exception:%s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandIDKeyBatchReport", e17, "", new java.lang.Object[0]);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public static void d() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = f169934a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            com.p314xaae8f345.mm.vfs.w6.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.u.a());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandIDKeyBatchReport", e17, "removeFile()", new java.lang.Object[0]);
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

    public static void e() {
        if (f169935b != null) {
            f169935b.d();
            f169935b = null;
        }
    }
}
