package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.l2 f90769a = new com.tencent.mm.plugin.appbrand.v8_snapshot.l2();

    public final com.eclipsesource.mmv8.snapshot.CreateSnapshotResult a(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader commLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        com.eclipsesource.mmv8.snapshot.CreateSnapshotParams createSnapshotParams;
        java.lang.String i17;
        kotlin.jvm.internal.o.g(commLibReader, "commLibReader");
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCreateLogic", "doCreateNodeOnlySnapshot, commLibReader: " + commLibReader);
        boolean z17 = cl.x.f42817a;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k1 k1Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k1.f90747b;
        k1Var.getClass();
        com.tencent.mm.plugin.appbrand.v8_snapshot.p1 p1Var = k1Var.f90748a;
        p1Var.getClass();
        com.tencent.mm.vfs.r6 b17 = com.tencent.mm.plugin.appbrand.v8_snapshot.p2.f90799a.b(snapshotInfo);
        if (b17 == null || (i17 = com.tencent.mm.vfs.w6.i(b17.o(), true)) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibCreateSnapshotParamsCreator", "WxaCommLibFeatureCreateSnapshotParamsCreator#createNodeOnly, snapshotDirPath is null");
            createSnapshotParams = null;
        } else {
            createSnapshotParams = new com.eclipsesource.mmv8.snapshot.CreateSnapshotParams(false, null, kz5.c0.d(new com.eclipsesource.mmv8.snapshot.ContextBootstrapParams.Builder().name(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v.b(snapshotInfo.f90668h)).setupNodeEnv(true).build()), null, com.tencent.mm.plugin.appbrand.v8_snapshot.o1.f90795a, i17);
        }
        if (createSnapshotParams == null) {
            return new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Failure(-203, "Create params failure");
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a.q(commLibReader, createSnapshotParams);
        p1Var.getClass();
        if ("".length() > 0) {
            p1Var.getClass();
            com.eclipsesource.mmv8.V8.setFlags("");
        }
        com.eclipsesource.mmv8.snapshot.CreateSnapshotResult create = com.eclipsesource.mmv8.snapshot.SnapshotCreator.create(createSnapshotParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCreateLogic", "doCreateNodeOnlySnapshot, result: " + create);
        kotlin.jvm.internal.o.d(create);
        return create;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.eclipsesource.mmv8.snapshot.CreateSnapshotResult b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r25, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.v8_snapshot.l2.b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo, boolean):com.eclipsesource.mmv8.snapshot.CreateSnapshotResult");
    }
}
