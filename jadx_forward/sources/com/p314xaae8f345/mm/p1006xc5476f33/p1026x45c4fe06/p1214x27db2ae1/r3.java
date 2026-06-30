package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f172345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 f172346e;

    public r3(l75.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 s3Var) {
        this.f172345d = k0Var;
        this.f172346e = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.k0 db6 = this.f172345d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k1.a(db6, "WxaPkgV8SnapshotInfo");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k1.b(db6, "WxaPkgV8SnapshotInfoV2")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "migrateTableV2, not need");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4(db6, db6.b(), null);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.y0(this.f172346e, db6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k1.a(db6, "WxaPkgV8SnapshotInfoV2");
            wz5.a.a(k4Var, null);
        } finally {
        }
    }
}
