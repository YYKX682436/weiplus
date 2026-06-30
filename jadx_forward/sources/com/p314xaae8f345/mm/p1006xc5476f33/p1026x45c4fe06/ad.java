package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f156429a = new java.util.concurrent.atomic.AtomicBoolean();

    public final void a() {
        if (this.f156429a.get()) {
            throw new java.lang.InterruptedException();
        }
    }

    public final void b(java.util.List list) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.c());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.l();
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                    java.lang.String m82467xfb82e301 = r6Var2.m82467xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                    java.lang.String quote = java.util.regex.Pattern.quote("-");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(quote, "quote(...)");
                    java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(m82467xfb82e301, new java.lang.String[]{quote}, false, 0, 6, null).toArray(new java.lang.String[0]);
                    if (strArr == null || strArr.length < 2) {
                        com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                        com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                    } else {
                        java.lang.String str = strArr[0];
                        if (list.contains(str)) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61201x533437e, str)) {
                                str = "@LibraryAppId";
                            }
                            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(u46.l.s(strArr[1], 1), 0);
                            int[] iArr = (int[]) hashMap.get(str);
                            if (iArr == null) {
                                iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.e(str) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.o(true) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().A(str, 0);
                                if (iArr == null) {
                                    iArr = new int[]{0};
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, u46.a.c(iArr, "-1"));
                                hashMap.put(str, iArr);
                            }
                            if (!u46.a.a(iArr, P)) {
                                com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                                com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, file(%s) deleted", r6Var2.o());
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, appId not include");
                        }
                    }
                }
                return;
            }
        }
        r6Var.l();
    }

    public final void c(java.util.List list) {
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc ccVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc.class);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c4) ccVar).Zi(str);
        }
    }

    public final void d(java.util.List list) {
        a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.zc zcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.zc();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("@LibraryAppId", str)) {
                k91.v5 k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().k1(str, "versionInfo");
                if (k17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17.f68926x94cd21e1)) {
                    linkedList.add(str);
                } else {
                    a();
                    if (zcVar.containsKey(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) zcVar.get(str);
                        if (c1Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, pkg is null!");
                        } else {
                            java.lang.String str2 = c1Var.f157313d;
                            int i17 = c1Var.f157314e;
                            int i18 = c1Var.f157315f;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(Di.i(str2, i17, i18)), java.lang.Integer.valueOf(Di.h(str2, i17, i18)));
                        }
                    } else {
                        int i19 = k17.w0() == null ? 0 : k17.w0().f158977d;
                        int i27 = i19 + 1;
                        if (i19 > 0) {
                            int[] A = Di.A(str, 0);
                            int i28 = Di.i(str, 0, i27);
                            if (i28 > 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanRelease, delete record(%s) < %d, count(%d)", str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28));
                                if (A != null) {
                                    if (!(A.length == 0)) {
                                        for (int i29 : A) {
                                            com.p314xaae8f345.mm.vfs.w6.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.a(str, i29), true);
                                        }
                                    }
                                }
                            }
                            Di.h(str, 0, i27);
                            gk1.g gVar = (gk1.g) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(gk1.g.class);
                            if (gVar != null) {
                                gVar.y0(str, 0, new gk1.e(i27));
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ec ecVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ec) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ec.class);
                            if (ecVar != null) {
                                ecVar.y0(str, i27);
                            }
                            k91.a4 a4Var = (k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class);
                            if (a4Var != null) {
                                a4Var.C1(str, i27);
                            }
                        }
                    }
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(linkedList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1> wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) c17).wi();
        if (!wi6.isEmpty()) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1 c1Var2 : wi6) {
                java.lang.String str3 = c1Var2.f157313d;
                hashSet.remove(str3);
                int i37 = c1Var2.f157314e;
                int i38 = c1Var2.f157315f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", str3, java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(Di2.i(str3, i37, i38)), java.lang.Integer.valueOf(Di2.h(str3, i37, i38)));
            }
        }
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158793e);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.String str4 = (java.lang.String) it6.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                if (r26.i0.n(str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379, false)) {
                }
            }
            if (q81.z.i().k(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact appID(%s) is pre-download-ing, skip", str4);
            } else {
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9> v17 = Di2.v(str4, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "selectAllIncludingModule…By_appId_versionType(...)");
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var : v17) {
                    if (android.text.TextUtils.isEmpty(n9Var.f67183x55b471cc)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, empty path, delete record(%s, %d)", n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67185x8987ca93));
                        Di2.a(n9Var);
                    } else {
                        long l17 = com.p314xaae8f345.mm.vfs.w6.l(n9Var.f67183x55b471cc);
                        if (l17 <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, path not found, delete record(%s, %d)", n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67185x8987ca93));
                            Di2.a(n9Var);
                        } else if (l17 <= millis) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file expired(mtime:%d, expired_time:%d), delete record(%s, %d)", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(millis), n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67185x8987ca93));
                            com.p314xaae8f345.mm.vfs.w6.h(n9Var.f67183x55b471cc);
                            Di2.a(n9Var);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file valid(mtime:%d, expired_time:%d), keep it(%s, %d).", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(millis), n9Var.f67177x28d45f97, java.lang.Integer.valueOf(n9Var.f67185x8987ca93));
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        java.lang.String h17 = gm0.j1.u().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        if (!r26.i0.n(h17, "/", false)) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/pkg/";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        f(str);
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c();
        com.p314xaae8f345.mm.vfs.w6.u(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        f(c17);
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3 w3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class);
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.A()) {
                    java.lang.String o17 = r6Var2.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    boolean j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().j(o17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
                    java.lang.String o18 = r6Var2.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
                    boolean z17 = y7Var.i(o18) != null;
                    if (!j17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.e1.class);
                        if (!(e1Var != null ? e1Var.o7(r6Var2) : false) && !z17) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) w3Var).Ai(o17);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k3.b(o17);
                        }
                    }
                } else if (r6Var2.y()) {
                    java.lang.String o19 = r6Var2.o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o19, "getAbsolutePath(...)");
                    f(o19);
                }
            }
        }
    }

    public final void g(java.util.List list) {
        a();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a();
            com.p314xaae8f345.mm.vfs.w6.f(ri1.q.a(str));
        }
    }

    public final void h(java.util.List appIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appIdList, "appIdList");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "run() entered but storage not ready");
            return;
        }
        if (appIdList.isEmpty()) {
            return;
        }
        this.f156429a.set(false);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            try {
                i(appIdList);
                d(appIdList);
                e();
                b(appIdList);
                c(appIdList);
                g(appIdList);
            } finally {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "interrupted %s", android.util.Log.getStackTraceString(e17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "process occur exception %s", th6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final void i(java.util.List list) {
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().a();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next()).f129217a);
        }
        for (java.lang.String str : arrayList) {
            if (list.contains(str)) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a(), str, 0, false, 6, null);
            }
        }
    }
}
