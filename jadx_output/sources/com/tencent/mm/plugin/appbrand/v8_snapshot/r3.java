package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f90812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.s3 f90813e;

    public r3(l75.k0 k0Var, com.tencent.mm.plugin.appbrand.v8_snapshot.s3 s3Var) {
        this.f90812d = k0Var;
        this.f90813e = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.k0 db6 = this.f90812d;
        com.tencent.mm.plugin.appbrand.utils.k1.a(db6, "WxaPkgV8SnapshotInfo");
        if (!com.tencent.mm.plugin.appbrand.utils.k1.b(db6, "WxaPkgV8SnapshotInfoV2")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "migrateTableV2, not need");
            return;
        }
        kotlin.jvm.internal.o.g(db6, "db");
        com.tencent.mm.plugin.appbrand.utils.k4 k4Var = new com.tencent.mm.plugin.appbrand.utils.k4(db6, db6.b(), null);
        try {
            com.tencent.mm.plugin.appbrand.v8_snapshot.s3.y0(this.f90813e, db6);
            com.tencent.mm.plugin.appbrand.utils.k1.a(db6, "WxaPkgV8SnapshotInfoV2");
            wz5.a.a(k4Var, null);
        } finally {
        }
    }
}
