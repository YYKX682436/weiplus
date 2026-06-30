package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0 f157850a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f157851b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.t6 f157852c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.n0.f157807a;

    public static final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r0 r0Var = f157850a;
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158742g * 1048576;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTempFileCleaner", "checkTotalTempFileLimitSync limit:" + j17);
        if (j17 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8 c7071x1f0975d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8();
        r0Var.b(j17, c7071x1f0975d8);
        if (c7071x1f0975d8.f143799m > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.j.f34556x366c91de, 248);
        }
    }
}
