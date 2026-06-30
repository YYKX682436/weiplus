package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f74896a = new java.util.concurrent.atomic.AtomicBoolean();

    public final void a() {
        if (this.f74896a.get()) {
            throw new java.lang.InterruptedException();
        }
    }

    public final void b(java.util.List list) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.page.sb.f87090c.c());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.l();
            return;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G != null) {
            if (!(G.length == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                    java.lang.String name = r6Var2.getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    java.lang.String quote = java.util.regex.Pattern.quote("-");
                    kotlin.jvm.internal.o.f(quote, "quote(...)");
                    java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(name, new java.lang.String[]{quote}, false, 0, 6, null).toArray(new java.lang.String[0]);
                    if (strArr == null || strArr.length < 2) {
                        com.tencent.mm.vfs.w6.h(r6Var2.o());
                        com.tencent.mm.vfs.w6.g(r6Var2.o(), true);
                    } else {
                        java.lang.String str = strArr[0];
                        if (list.contains(str)) {
                            if (kotlin.jvm.internal.o.b(com.tencent.xwebsdk.BuildConfig.INSTALL_TYPE, str)) {
                                str = "@LibraryAppId";
                            }
                            int P = com.tencent.mm.sdk.platformtools.t8.P(u46.l.s(strArr[1], 1), 0);
                            int[] iArr = (int[]) hashMap.get(str);
                            if (iArr == null) {
                                iArr = com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.e(str) ? com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.o(true) : com.tencent.mm.plugin.appbrand.app.r9.Di().A(str, 0);
                                if (iArr == null) {
                                    iArr = new int[]{0};
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, u46.a.c(iArr, "-1"));
                                hashMap.put(str, iArr);
                            }
                            if (!u46.a.a(iArr, P)) {
                                com.tencent.mm.vfs.w6.h(r6Var2.o());
                                com.tencent.mm.vfs.w6.g(r6Var2.o(), true);
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, file(%s) deleted", r6Var2.o());
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanExpiredWebViewCodeCache, appId not include");
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
        com.tencent.mm.plugin.appbrand.appcache.cc ccVar = (com.tencent.mm.plugin.appbrand.appcache.cc) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.cc.class);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a();
            ((com.tencent.mm.plugin.appbrand.appcache.c4) ccVar).Zi(str);
        }
    }

    public final void d(java.util.List list) {
        a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        com.tencent.mm.plugin.appbrand.zc zcVar = new com.tencent.mm.plugin.appbrand.zc();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!kotlin.jvm.internal.o.b("@LibraryAppId", str)) {
                k91.v5 k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(str, "versionInfo");
                if (k17 == null || com.tencent.mm.sdk.platformtools.t8.K0(k17.field_versionInfo)) {
                    linkedList.add(str);
                } else {
                    a();
                    if (zcVar.containsKey(str)) {
                        com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 c1Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) zcVar.get(str);
                        if (c1Var == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, pkg is null!");
                        } else {
                            java.lang.String str2 = c1Var.f75780d;
                            int i17 = c1Var.f75781e;
                            int i18 = c1Var.f75782f;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(Di.i(str2, i17, i18)), java.lang.Integer.valueOf(Di.h(str2, i17, i18)));
                        }
                    } else {
                        int i19 = k17.w0() == null ? 0 : k17.w0().f77444d;
                        int i27 = i19 + 1;
                        if (i19 > 0) {
                            int[] A = Di.A(str, 0);
                            int i28 = Di.i(str, 0, i27);
                            if (i28 > 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanRelease, delete record(%s) < %d, count(%d)", str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i28));
                                if (A != null) {
                                    if (!(A.length == 0)) {
                                        for (int i29 : A) {
                                            com.tencent.mm.vfs.w6.g(com.tencent.mm.plugin.appbrand.page.sb.f87090c.a(str, i29), true);
                                        }
                                    }
                                }
                            }
                            Di.h(str, 0, i27);
                            gk1.g gVar = (gk1.g) com.tencent.mm.plugin.appbrand.app.r9.fj(gk1.g.class);
                            if (gVar != null) {
                                gVar.y0(str, 0, new gk1.e(i27));
                            }
                            com.tencent.mm.plugin.appbrand.appcache.ec ecVar = (com.tencent.mm.plugin.appbrand.appcache.ec) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.ec.class);
                            if (ecVar != null) {
                                ecVar.y0(str, i27);
                            }
                            k91.a4 a4Var = (k91.a4) com.tencent.mm.plugin.appbrand.app.r9.fj(k91.a4.class);
                            if (a4Var != null) {
                                a4Var.C1(str, i27);
                            }
                        }
                    }
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(linkedList);
        com.tencent.mm.plugin.appbrand.appcache.qa Di2 = com.tencent.mm.plugin.appbrand.app.r9.Di();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.util.List<com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1> wi6 = ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c17).wi();
        if (!wi6.isEmpty()) {
            for (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 c1Var2 : wi6) {
                java.lang.String str3 = c1Var2.f75780d;
                hashSet.remove(str3);
                int i37 = c1Var2.f75781e;
                int i38 = c1Var2.f75782f;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "cleanReleaseContact, for export occupied, delete record(%s) < %d, deleting pkgCount: %d, moduleCount: %d", str3, java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(Di2.i(str3, i37, i38)), java.lang.Integer.valueOf(Di2.h(str3, i37, i38)));
            }
        }
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.tencent.mm.sdk.platformtools.t8.i1() - com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().N.f77260e);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.String str4 = (java.lang.String) it6.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                kotlin.jvm.internal.o.d(str4);
                if (r26.i0.n(str4, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE, false)) {
                }
            }
            if (q81.z.i().k(str4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact appID(%s) is pre-download-ing, skip", str4);
            } else {
                java.util.List<com.tencent.mm.plugin.appbrand.appcache.n9> v17 = Di2.v(str4, 0);
                kotlin.jvm.internal.o.f(v17, "selectAllIncludingModule…By_appId_versionType(...)");
                for (com.tencent.mm.plugin.appbrand.appcache.n9 n9Var : v17) {
                    if (android.text.TextUtils.isEmpty(n9Var.field_pkgPath)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, empty path, delete record(%s, %d)", n9Var.field_appId, java.lang.Integer.valueOf(n9Var.field_version));
                        Di2.a(n9Var);
                    } else {
                        long l17 = com.tencent.mm.vfs.w6.l(n9Var.field_pkgPath);
                        if (l17 <= 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, path not found, delete record(%s, %d)", n9Var.field_appId, java.lang.Integer.valueOf(n9Var.field_version));
                            Di2.a(n9Var);
                        } else if (l17 <= millis) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file expired(mtime:%d, expired_time:%d), delete record(%s, %d)", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(millis), n9Var.field_appId, java.lang.Integer.valueOf(n9Var.field_version));
                            com.tencent.mm.vfs.w6.h(n9Var.field_pkgPath);
                            Di2.a(n9Var);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "processReleaseWithoutContact, file valid(mtime:%d, expired_time:%d), keep it(%s, %d).", java.lang.Long.valueOf(l17), java.lang.Long.valueOf(millis), n9Var.field_appId, java.lang.Integer.valueOf(n9Var.field_version));
                        }
                    }
                }
            }
        }
    }

    public final void e() {
        java.lang.String h17 = gm0.j1.u().h();
        kotlin.jvm.internal.o.d(h17);
        if (!r26.i0.n(h17, "/", false)) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/pkg/";
        com.tencent.mm.vfs.w6.u(str);
        f(str);
        java.lang.String c17 = com.tencent.mm.plugin.appbrand.appcache.d9.c();
        com.tencent.mm.vfs.w6.u(c17);
        kotlin.jvm.internal.o.d(c17);
        f(c17);
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.y() && (G = r6Var.G()) != null) {
            com.tencent.mm.plugin.appbrand.appcache.w3 w3Var = (com.tencent.mm.plugin.appbrand.appcache.w3) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.w3.class);
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.A()) {
                    java.lang.String o17 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    boolean j17 = com.tencent.mm.plugin.appbrand.app.r9.Di().j(o17);
                    com.tencent.mm.plugin.appbrand.appcache.y7 y7Var = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
                    java.lang.String o18 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                    boolean z17 = y7Var.i(o18) != null;
                    if (!j17) {
                        com.tencent.mm.plugin.appbrand.v8_snapshot.e1 e1Var = (com.tencent.mm.plugin.appbrand.v8_snapshot.e1) i95.n0.c(com.tencent.mm.plugin.appbrand.v8_snapshot.e1.class);
                        if (!(e1Var != null ? e1Var.o7(r6Var2) : false) && !z17) {
                            ((com.tencent.mm.plugin.appbrand.appcache.p9) w3Var).Ai(o17);
                            com.tencent.mm.plugin.appbrand.appcache.k3.b(o17);
                        }
                    }
                } else if (r6Var2.y()) {
                    java.lang.String o19 = r6Var2.o();
                    kotlin.jvm.internal.o.f(o19, "getAbsolutePath(...)");
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
            com.tencent.mm.vfs.w6.f(ri1.q.a(str));
        }
    }

    public final void h(java.util.List appIdList) {
        kotlin.jvm.internal.o.g(appIdList, "appIdList");
        if (com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "run() entered but storage not ready");
            return;
        }
        if (appIdList.isEmpty()) {
            return;
        }
        this.f74896a.set(false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "interrupted %s", android.util.Log.getStackTraceString(e17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgCleanupLogic", "process occur exception %s", th6);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCleanupLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final void i(java.util.List list) {
        java.util.List a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().a();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.luggage.sdk.processes.s) it.next()).f47684a);
        }
        for (java.lang.String str : arrayList) {
            if (list.contains(str)) {
                com.tencent.luggage.sdk.processes.r.u(com.tencent.mm.plugin.appbrand.task.u0.f89199h.a(), str, 0, false, 6, null);
            }
        }
    }
}
