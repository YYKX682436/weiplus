package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class f3 implements com.tencent.mm.plugin.appbrand.v8_snapshot.e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f90706d = new com.tencent.mm.plugin.appbrand.v8_snapshot.f3();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f90707e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f90708f = java.util.Collections.newSetFromMap(new java.util.HashMap());

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo O5() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f3Var = f90706d;
        if (!z17) {
            return f3Var.k(new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null), com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo k17 = f3Var.k(new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null), com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "clientQueryNodeOnlySnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return k17;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo S4(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(category, "category");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        com.tencent.mm.plugin.appbrand.v8_snapshot.f3 f3Var = f90706d;
        if (!z17) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo k17 = f3Var.k(reader, category);
            return k17 == null ? f3Var.O5() : k17;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo k18 = f3Var.k(reader, category);
        if (k18 == null) {
            k18 = f3Var.O5();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "clientQuerySnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return k18;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void T4(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.u2 u2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.u2.f90830d;
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.z2(snapshotInfo, u2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean Z9(java.lang.String wxaPkgPath) {
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = i();
        if (i17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: ".concat(wxaPkgPath));
            return b(i17.z0(i17.rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ?", wxaPkgPath)), com.tencent.mm.plugin.appbrand.v8_snapshot.r2.f90811d);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfoAllCategory, storage is null");
        return false;
    }

    public final boolean b(java.util.List list, yz5.l lVar) {
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, daoList is empty");
            return false;
        }
        java.util.Iterator it = list.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo a17 = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v.a((com.tencent.mm.plugin.appbrand.v8_snapshot.q3) it.next());
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, create snapshotInfo failure");
            } else {
                com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
                if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotInfo: " + a17);
                }
                boolean a18 = com.tencent.mm.plugin.appbrand.v8_snapshot.p2.f90799a.a(a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotDeleted: " + a18);
                if (a18 && ((java.lang.Boolean) lVar.invoke(a17.f90666f)).booleanValue()) {
                }
            }
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, allDeleted: " + z17);
        return z17;
    }

    public final void c() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader nodeFakeCommLibReader = new com.tencent.mm.plugin.appbrand.v8_snapshot.NodeFakeCommLibReader(null, 1, null);
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90773i;
        if (k2Var.f(nodeFakeCommLibReader, l3Var)) {
            if (!f90707e.compareAndSet(false, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "createNodeOnlySnapshotIfNeed, is creating now");
                return;
            }
            java.lang.String b17 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.b(nodeFakeCommLibReader);
            kotlin.jvm.internal.o.d(b17);
            f(nodeFakeCommLibReader, b17, l3Var, true, com.tencent.mm.plugin.appbrand.v8_snapshot.v2.f90833d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0088, code lost:
    
        if (r2.e() != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r39, java.lang.String r40, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 r41, boolean r42, yz5.a r43) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, java.lang.String, com.tencent.mm.plugin.appbrand.v8_snapshot.l3, boolean, yz5.a):void");
    }

    public final boolean h(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, snapshotInfo: " + wxaPkgV8SnapshotInfo);
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = i();
        if (i17 != null) {
            wxaPkgV8SnapshotInfo.getClass();
            com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
            q3Var.field_arch = wxaPkgV8SnapshotInfo.f90664d;
            q3Var.field_wxaPkgMd5 = wxaPkgV8SnapshotInfo.f90665e;
            q3Var.field_wxaPkgPath = wxaPkgV8SnapshotInfo.f90666f;
            q3Var.field_wxaPkgVersion = wxaPkgV8SnapshotInfo.f90667g;
            q3Var.field_snapshotCategory = wxaPkgV8SnapshotInfo.f90668h.f90775d;
            q3Var.field_snapshotPath = wxaPkgV8SnapshotInfo.f90669i;
            q3Var.field_snapshotLastModified = wxaPkgV8SnapshotInfo.f90670m;
            q3Var.field_snapshotLength = wxaPkgV8SnapshotInfo.f90671n;
            q3Var.field_snapshotBaseConfig = wxaPkgV8SnapshotInfo.f90672o;
            q3Var.field_snapshotMetaInfo = wxaPkgV8SnapshotInfo.f90673p.toString();
            q3Var.field_isNodeSnapshot = wxaPkgV8SnapshotInfo.f90674q;
            q3Var.field_snapshotNodeConfig = wxaPkgV8SnapshotInfo.f90675r;
            q3Var.field_producingSnapshotCount = wxaPkgV8SnapshotInfo.f90676s;
            q3Var.field_consumingSnapshotCount = wxaPkgV8SnapshotInfo.f90677t;
            q3Var.field_recoverCount = wxaPkgV8SnapshotInfo.f90678u;
            z17 = i17.J0(q3Var);
        } else {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, insertOrReplace failure");
        }
        return z17;
    }

    public final com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i() {
        int i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d;
        return (com.tencent.mm.plugin.appbrand.v8_snapshot.s3) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.v8_snapshot.s3.class);
    }

    public final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo k(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 l3Var) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.q3 P0;
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.b(iCommLibReader);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgPath: " + b17);
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.q2.f90808a.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, block");
            return null;
        }
        boolean z17 = false;
        if (b17 == null || b17.length() == 0) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = i();
        if (i17 == null || (P0 = i17.P0(b17, l3Var)) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, dao not exist");
            return null;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo a17 = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v.a(P0);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, create snapshotInfo failure");
            return null;
        }
        if (a17.f90667g == iCommLibReader.getF90658d().pkgVersion()) {
            java.lang.String b18 = com.tencent.mm.plugin.appbrand.v8_snapshot.j2.b(iCommLibReader);
            java.lang.String str = a17.f90666f;
            if (kotlin.jvm.internal.o.b(str, b18)) {
                z17 = kotlin.jvm.internal.o.b("/assets/wxa_library", str) ? true : kotlin.jvm.internal.o.b(a17.f90665e, com.tencent.mm.plugin.appbrand.v8_snapshot.j2.a(iCommLibReader));
            }
        }
        if (z17) {
            return a17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgMd5 change, do deleteSnapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i18 = i();
        if (i18 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: " + b17 + ", category: " + l3Var);
            b(i18.z0(i18.rawQuery("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ? AND snapshotCategory = ?", b17, l3Var.f90775d)), new com.tencent.mm.plugin.appbrand.v8_snapshot.y2(l3Var));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfo, storage is null");
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void ki(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.t2 t2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.t2.f90824d;
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.z2(snapshotInfo, t2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean lc(int i17) {
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i18 = i();
        if (i18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteAllSnapshotDirBelowVersion, storage is null");
            return false;
        }
        java.util.List L0 = i18.L0(i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : L0) {
            if (((com.tencent.mm.plugin.appbrand.v8_snapshot.q3) obj).field_wxaPkgVersion > 0) {
                arrayList.add(obj);
            }
        }
        return b(arrayList, com.tencent.mm.plugin.appbrand.v8_snapshot.r2.f90811d);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean o7(com.tencent.mm.vfs.r6 file) {
        kotlin.jvm.internal.o.g(file, "file");
        com.tencent.mm.vfs.r6 c17 = com.tencent.mm.plugin.appbrand.v8_snapshot.p2.f90799a.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, snapshotParentDir is null");
            return false;
        }
        java.lang.String o17 = file.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.String o18 = c17.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, filePath: " + o17 + ", snapshotParentDirPath: " + o18);
        }
        return r26.n0.B(o17, o18, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void w6(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        com.tencent.mm.plugin.appbrand.v8_snapshot.s2 s2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.s2.f90819d;
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.v8_snapshot.z2(snapshotInfo, s2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }
}
