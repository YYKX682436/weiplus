package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class a2 implements com.tencent.mm.plugin.appbrand.v8_snapshot.d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.a2 f90682d = new com.tencent.mm.plugin.appbrand.v8_snapshot.a2();

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public void Rd(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        uk0.a.d(snapshotInfo, com.tencent.mm.plugin.appbrand.v8_snapshot.v1.f90832a);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo gh(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        k2Var.getClass();
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = null;
        if (!com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            if (!k2Var.e(reader, category)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableSnapshotInfo, ban by config");
                return null;
            }
            try {
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) uk0.a.d(new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams(reader, category), com.tencent.mm.plugin.appbrand.v8_snapshot.z1.f90849a);
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                if (!wxaPkgV8SnapshotInfo2.a(reader, k2Var.f(reader, category))) {
                    wxaPkgV8SnapshotInfo2 = null;
                }
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
                k2Var.getClass();
                j1Var.a(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90763o);
                return wxaPkgV8SnapshotInfo2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e17, "queryUsableSnapshotInfo failure", new java.lang.Object[0]);
                return null;
            }
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (k2Var.e(reader, category)) {
            try {
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo3 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) uk0.a.d(new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaCommLibV8SnapshotClientImpl$QuerySnapshotInfoParams(reader, category), com.tencent.mm.plugin.appbrand.v8_snapshot.z1.f90849a);
                if (wxaPkgV8SnapshotInfo3 != null) {
                    if (!wxaPkgV8SnapshotInfo3.a(reader, k2Var.f(reader, category))) {
                        wxaPkgV8SnapshotInfo3 = null;
                    }
                    if (wxaPkgV8SnapshotInfo3 != null) {
                        com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var2 = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
                        k2Var.getClass();
                        j1Var2.a(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90763o);
                        wxaPkgV8SnapshotInfo = wxaPkgV8SnapshotInfo3;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e18, "queryUsableSnapshotInfo failure", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableSnapshotInfo, ban by config");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "queryUsableSnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return wxaPkgV8SnapshotInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public void u7(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        uk0.a.d(snapshotInfo, com.tencent.mm.plugin.appbrand.v8_snapshot.x1.f90837a);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo w5() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        k2Var.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = null;
        if (!z17) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader nodeFakeCommLibReader = new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null);
            if (!k2Var.f(nodeFakeCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableNodeOnlySnapshotInfo, ban by config");
                return null;
            }
            try {
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo2 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) uk0.a.d(iPCVoid, com.tencent.mm.plugin.appbrand.v8_snapshot.y1.f90847a);
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                if (!wxaPkgV8SnapshotInfo2.a(nodeFakeCommLibReader, true)) {
                    wxaPkgV8SnapshotInfo2 = null;
                }
                if (wxaPkgV8SnapshotInfo2 == null) {
                    return null;
                }
                com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
                k2Var.getClass();
                j1Var.a(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90763o);
                return wxaPkgV8SnapshotInfo2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e17, "queryUsableNodeOnlySnapshotInfo failure", new java.lang.Object[0]);
                return null;
            }
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader nodeFakeCommLibReader2 = new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null);
        if (k2Var.f(nodeFakeCommLibReader2, com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i)) {
            try {
                com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo3 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) uk0.a.d(iPCVoid, com.tencent.mm.plugin.appbrand.v8_snapshot.y1.f90847a);
                if (wxaPkgV8SnapshotInfo3 != null) {
                    if (!wxaPkgV8SnapshotInfo3.a(nodeFakeCommLibReader2, true)) {
                        wxaPkgV8SnapshotInfo3 = null;
                    }
                    if (wxaPkgV8SnapshotInfo3 != null) {
                        com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var2 = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
                        k2Var.getClass();
                        j1Var2.a(com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90763o);
                        wxaPkgV8SnapshotInfo = wxaPkgV8SnapshotInfo3;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxaCommLibV8SnapshotClientImpl", e18, "queryUsableNodeOnlySnapshotInfo failure", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotClientImpl", "queryUsableNodeOnlySnapshotInfo, ban by config");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "queryUsableNodeOnlySnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return wxaPkgV8SnapshotInfo;
    }
}
