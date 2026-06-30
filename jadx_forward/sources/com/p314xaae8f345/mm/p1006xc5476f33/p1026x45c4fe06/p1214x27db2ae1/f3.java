package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class f3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3 f172239d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f172240e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f172241f = java.util.Collections.newSetFromMap(new java.util.HashMap());

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 O5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3 f3Var = f172239d;
        if (!z17) {
            return f3Var.k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5(null, 1, null), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172306i);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 k17 = f3Var.k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5(null, 1, null), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172306i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "clientQueryNodeOnlySnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return k17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 S4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 reader, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reader, "reader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3 f3Var = f172239d;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 k17 = f3Var.k(reader, category);
            return k17 == null ? f3Var.O5() : k17;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 k18 = f3Var.k(reader, category);
        if (k18 == null) {
            k18 = f3Var.O5();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotCommons", "clientQuerySnapshotInfo cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        return k18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public void T4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.u2 u2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.u2.f172363d;
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.z2(snapshotInfo, u2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public boolean Z9(java.lang.String wxaPkgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaPkgPath, "wxaPkgPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i17 = i();
        if (i17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: ".concat(wxaPkgPath));
            return b(i17.z0(i17.m145256x1d3f4980("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ?", wxaPkgPath)), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.r2.f172344d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfoAllCategory, storage is null");
        return false;
    }

    public final boolean b(java.util.List list, yz5.l lVar) {
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, daoList is empty");
            return false;
        }
        java.util.Iterator it = list.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.f172194v.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3) it.next());
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, create snapshotInfo failure");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotInfo: " + a17);
                }
                boolean a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.p2.f172332a.a(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, snapshotDeleted: " + a18);
                if (a18 && ((java.lang.Boolean) lVar.mo146xb9724478(a17.f172199f)).booleanValue()) {
                }
            }
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "batchDeleteSnapshotInfo, allDeleted: " + z17);
        return z17;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5 c12742xf840dea5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5(null, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2 k2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172306i;
        if (k2Var.f(c12742xf840dea5, l3Var)) {
            if (!f172240e.compareAndSet(false, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "createNodeOnlySnapshotIfNeed, is creating now");
                return;
            }
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.b(c12742xf840dea5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            f(c12742xf840dea5, b17, l3Var, true, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.v2.f172366d);
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
    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 r39, java.lang.String r40, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 r41, boolean r42, yz5.a r43) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.f3.f(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, java.lang.String, com.tencent.mm.plugin.appbrand.v8_snapshot.l3, boolean, yz5.a):void");
    }

    public final boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, snapshotInfo: " + c12745x1ee4df80);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i17 = i();
        if (i17 != null) {
            c12745x1ee4df80.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
            q3Var.f69481x2259747b = c12745x1ee4df80.f172197d;
            q3Var.f69493xd1cec4cd = c12745x1ee4df80.f172198e;
            q3Var.f69494x680b2eb6 = c12745x1ee4df80.f172199f;
            q3Var.f69495xf173fca7 = c12745x1ee4df80.f172200g;
            q3Var.f69487x955d8787 = c12745x1ee4df80.f172201h.f172308d;
            q3Var.f69492xd4a3db2e = c12745x1ee4df80.f172202i;
            q3Var.f69488x70346188 = c12745x1ee4df80.f172203m;
            q3Var.f69489x347c13af = c12745x1ee4df80.f172204n;
            q3Var.f69486x1a7ea1bc = c12745x1ee4df80.f172205o;
            q3Var.f69490x777c2edc = c12745x1ee4df80.f172206p.toString();
            q3Var.f69483x609f3215 = c12745x1ee4df80.f172207q;
            q3Var.f69491x937c602d = c12745x1ee4df80.f172208r;
            q3Var.f69484xa9348ff3 = c12745x1ee4df80.f172209s;
            q3Var.f69482xfa9bc557 = c12745x1ee4df80.f172210t;
            q3Var.f69485x80a1a130 = c12745x1ee4df80.f172211u;
            z17 = i17.J0(q3Var);
        } else {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "flushSnapshotInfo, insertOrReplace failure");
        }
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.class);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 P0;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.b(interfaceC11702x4ae7c33);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgPath: " + b17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q2.f172341a.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, block");
            return null;
        }
        boolean z17 = false;
        if (b17 == null || b17.length() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i17 = i();
        if (i17 == null || (P0 = i17.P0(b17, l3Var)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, dao not exist");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.f172194v.a(P0);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, create snapshotInfo failure");
            return null;
        }
        if (a17.f172200g == interfaceC11702x4ae7c33.getF172191d().mo49191x1c82a56c()) {
            java.lang.String b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.b(interfaceC11702x4ae7c33);
            java.lang.String str = a17.f172199f;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, b18)) {
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("/assets/wxa_library", str) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17.f172198e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.a(interfaceC11702x4ae7c33));
            }
        }
        if (z17) {
            return a17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "querySnapshotInfo, wxaPkgMd5 change, do deleteSnapshotInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i18 = i();
        if (i18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPathAllArch, wxaPkgPath: " + b17 + ", category: " + l3Var);
            b(i18.z0(i18.m145256x1d3f4980("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgPath = ? AND snapshotCategory = ?", b17, l3Var.f172308d)), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.y2(l3Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteSnapshotInfo, storage is null");
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public void ki(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.t2.f172357d;
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.z2(snapshotInfo, t2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public boolean lc(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 i18 = i();
        if (i18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "deleteAllSnapshotDirBelowVersion, storage is null");
            return false;
        }
        java.util.List L0 = i18.L0(i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : L0) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3) obj).f69495xf173fca7 > 0) {
                arrayList.add(obj);
            }
        }
        return b(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.r2.f172344d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public boolean o7(com.p314xaae8f345.mm.vfs.r6 file) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
        com.p314xaae8f345.mm.vfs.r6 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.p2.f172332a.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, snapshotParentDir is null");
            return false;
        }
        java.lang.String o17 = file.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String o18 = c17.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotManager", "isSnapshot, filePath: " + o17 + ", snapshotParentDirPath: " + o18);
        }
        return r26.n0.B(o17, o18, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1
    public void w6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 snapshotInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotInfo, "snapshotInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s2.f172352d;
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.z2(snapshotInfo, s2Var), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
    }
}
