package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f90850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f90851e;

    public z2(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, yz5.l lVar) {
        this.f90850d = wxaPkgV8SnapshotInfo;
        this.f90851e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo a17;
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d;
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = f3Var.i();
        if (i17 != null) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f90850d;
            com.tencent.mm.plugin.appbrand.v8_snapshot.q3 P0 = i17.P0(wxaPkgV8SnapshotInfo.f90666f, wxaPkgV8SnapshotInfo.f90668h);
            if (P0 != null && (a17 = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v.a(P0)) != null) {
                f3Var.h((com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) this.f90851e.invoke(a17));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "markConsumeSnapshot, realSnapshotInfo is null");
    }
}
