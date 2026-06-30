package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f75522d = new java.util.concurrent.atomic.AtomicBoolean();

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        long j17;
        java.util.Iterator it;
        long j18;
        long j19;
        java.lang.Long l17;
        java.util.HashMap hashMap;
        long j27;
        java.util.HashMap hashMap2;
        long j28;
        java.util.Iterator it6;
        long j29;
        long j37;
        boolean z17 = false;
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_expired_cleanup_time, 0) * 86400;
        long j38 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().N.f77260e;
        int i18 = 1;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_expired_cleanup_enable, 0) == 1;
        long j39 = com.tencent.mm.plugin.appbrand.appcache.z2.f76087a;
        long j47 = 0;
        if (j39 > 0) {
            z18 = true;
            Ni = j39;
            j38 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "expiredTime: " + Ni + " seconds, expiredCleanupEnable: " + z18);
        if (Ni <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("launchAppTime > 0 and launchAppTime < " + (c01.id.e() - Ni));
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "select %s from %s left join %s on %s where %s order by %s", java.util.Arrays.copyOf(new java.lang.Object[]{"WxaAttributesTable.appId,WxaAttributesTable.nickname,case when WxaAttributesTable.lastLaunchAppTime > 0 then WxaAttributesTable.lastLaunchAppTime else AppBrandLauncherLayoutItem.updateTime end as launchAppTime,WxaAttributesTable.appInfo,AppBrandLauncherLayoutItem.versionType", "WxaAttributesTable", "AppBrandLauncherLayoutItem", "WxaAttributesTable.username = AppBrandLauncherLayoutItem.brandId", sb6.toString(), "launchAppTime"}, 6));
        kotlin.jvm.internal.o.f(format, "format(...)");
        x51.k0 Ri = com.tencent.mm.plugin.appbrand.app.r9.Ri();
        int i19 = 4;
        if (Ri != null) {
            android.database.Cursor f17 = Ri.f(format, new java.lang.String[0], 0);
            kotlin.jvm.internal.o.f(f17, "rawQuery(...)");
            try {
                if (f17.moveToFirst()) {
                    while (true) {
                        java.lang.String string = f17.getString(0);
                        f17.getString(i18);
                        f17.getLong(2);
                        k91.j5 a17 = k91.j5.a(f17.getString(3));
                        boolean c17 = a17 != null ? a17.c() : false;
                        int i27 = a17 != null ? a17.f305629d : 0;
                        int i28 = f17.getInt(i19);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && !c17 && !kotlin.jvm.internal.o.b("@LibraryAppId", string)) {
                            kotlin.jvm.internal.o.d(string);
                            arrayList.add(new com.tencent.mm.plugin.appbrand.appcache.a3(string, i28, i27));
                        }
                        if (!f17.moveToNext()) {
                            break;
                        }
                        i18 = 1;
                        i19 = 4;
                    }
                }
                vz5.b.a(f17, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(f17, th6);
                    throw th7;
                }
            }
        }
        java.util.List a18 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a18, 10));
        java.util.Iterator it7 = ((java.util.ArrayList) a18).iterator();
        while (it7.hasNext()) {
            arrayList2.add(((com.tencent.luggage.sdk.processes.s) it7.next()).f47684a);
        }
        kz5.h0.B(arrayList, new com.tencent.mm.plugin.appbrand.appcache.b3(arrayList2));
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c18, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.util.List wi6 = ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c18).wi();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(wi6, 10));
        java.util.Iterator it8 = wi6.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) it8.next()).f75780d);
        }
        kz5.h0.B(arrayList, new com.tencent.mm.plugin.appbrand.appcache.c3(arrayList3));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("expiredAppIdLists: ");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((com.tencent.mm.plugin.appbrand.appcache.a3) it9.next()).f75413a);
        }
        sb7.append(arrayList4);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", sb7.toString());
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.f75522d.get()) {
            throw new java.lang.InterruptedException();
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            com.tencent.mm.plugin.appbrand.appcache.a3 a3Var = (com.tencent.mm.plugin.appbrand.appcache.a3) it10.next();
            java.lang.String str2 = a3Var.f75413a;
            if (!hashMap3.containsKey(str2)) {
                com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                java.util.List n17 = Di != null ? Di.n(str2) : null;
                if ((n17 == null || n17.isEmpty()) ? true : z17) {
                    j17 = Ni;
                    hashMap2 = hashMap3;
                    j19 = j38;
                    it = it10;
                    j27 = j47;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete app: " + str2);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.util.Iterator it11 = n17.iterator();
                    long j48 = 0;
                    while (it11.hasNext()) {
                        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = (com.tencent.mm.plugin.appbrand.appcache.n9) it11.next();
                        java.lang.String field_appId = n9Var.field_appId;
                        kotlin.jvm.internal.o.f(field_appId, "field_appId");
                        java.util.Iterator it12 = it11;
                        if (!r26.i0.n(field_appId, "$__PLUGINCODE__", false) && com.tencent.mm.vfs.w6.j(n9Var.field_pkgPath)) {
                            if (!com.tencent.mm.plugin.appbrand.appcache.g0.b(n9Var.field_debugType) || j38 <= 0) {
                                j28 = Ni;
                                it6 = it10;
                            } else {
                                long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.tencent.mm.sdk.platformtools.t8.i1() - j38);
                                it6 = it10;
                                long l18 = com.tencent.mm.vfs.w6.l(n9Var.field_pkgPath);
                                if (l18 <= 0 || l18 <= millis) {
                                    j28 = Ni;
                                } else {
                                    j28 = Ni;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", n9Var.field_appId + " record not expired, lastModified: " + l18 + " mills, minDateToKeep: " + millis + " mills, withoutContactClearSeconds: " + j38 + " seconds");
                                }
                            }
                            com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(n9Var.field_pkgPath);
                            if (m17 != null) {
                                j37 = m17.f213234d;
                                j29 = j48;
                            } else {
                                j29 = j48;
                                j37 = 0;
                            }
                            j48 = j29 + j37;
                            if (z18) {
                                com.tencent.mm.vfs.w6.h(n9Var.field_pkgPath);
                                com.tencent.mm.plugin.appbrand.app.r9.Di().a(n9Var);
                            }
                        } else {
                            j28 = Ni;
                            it6 = it10;
                        }
                        it11 = it12;
                        Ni = j28;
                        it10 = it6;
                    }
                    j17 = Ni;
                    it = it10;
                    long j49 = j48;
                    if (j49 > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete pkgSize: " + j49 + " bytes");
                        j18 = j49 + 0;
                    } else {
                        j18 = 0;
                    }
                    java.lang.String j57 = gm0.j1.b().j();
                    com.tencent.mm.plugin.appbrand.g0 g0Var = com.tencent.mm.plugin.appbrand.j0.f78443d;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    long d17 = g0Var.d(str2, bool) + ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).Bi(str2);
                    kotlin.jvm.internal.o.d(j57);
                    j19 = j38;
                    java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(new te.a(j57, str2).f417764d, true);
                    if (s17 != null) {
                        long j58 = 0;
                        for (java.util.Iterator it13 = s17.iterator(); it13.hasNext(); it13 = it13) {
                            j58 += ((com.tencent.mm.vfs.x1) it13.next()).f213234d;
                        }
                        l17 = java.lang.Long.valueOf(j58);
                    } else {
                        l17 = null;
                    }
                    long longValue = d17 + (l17 != null ? l17.longValue() : 0L);
                    if (longValue > 0) {
                        hashMap = hashMap3;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete fsSize: " + longValue + " bytes");
                        j18 += longValue;
                        if (z18) {
                            g0Var.e(j57, str2, bool);
                        }
                    } else {
                        hashMap = hashMap3;
                    }
                    j27 = 0;
                    if (j18 > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete totalSize: " + j18 + " bytes, cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
                        a3Var.f75416d = j18;
                        hashMap2 = hashMap;
                        hashMap2.put(str2, a3Var);
                    } else {
                        hashMap2 = hashMap;
                    }
                }
                j47 = j27;
                hashMap3 = hashMap2;
                Ni = j17;
                it10 = it;
                j38 = j19;
                z17 = false;
            }
        }
        long j59 = Ni;
        long j66 = j47;
        java.util.Collection values = hashMap3.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.List S0 = kz5.n0.S0(values);
        if (S0.isEmpty()) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppExpireCleanReportStruct weAppExpireCleanReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppExpireCleanReportStruct();
        weAppExpireCleanReportStruct.f62236f = S0.size();
        java.util.Iterator it14 = S0.iterator();
        long j67 = j66;
        while (it14.hasNext()) {
            j67 += ((com.tencent.mm.plugin.appbrand.appcache.a3) it14.next()).f75416d;
        }
        weAppExpireCleanReportStruct.f62235e = j67;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : S0) {
            if (!(((com.tencent.mm.plugin.appbrand.appcache.a3) obj).f75415c == 4)) {
                arrayList5.add(obj);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList5, new com.tencent.mm.plugin.appbrand.appcache.d3());
        weAppExpireCleanReportStruct.f62237g = F0.size();
        java.util.Iterator it15 = F0.iterator();
        long j68 = j66;
        while (it15.hasNext()) {
            j68 += ((com.tencent.mm.plugin.appbrand.appcache.a3) it15.next()).f75416d;
        }
        weAppExpireCleanReportStruct.f62238h = j68;
        int size = F0.size();
        if (size > 10) {
            size = 10;
        }
        int i29 = 0;
        while (i29 < size) {
            int i37 = i29 + 1;
            switch (i37) {
                case 1:
                    weAppExpireCleanReportStruct.f62241k = weAppExpireCleanReportStruct.b("Top1WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62242l = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 2:
                    weAppExpireCleanReportStruct.f62243m = weAppExpireCleanReportStruct.b("Top2WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62244n = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 3:
                    weAppExpireCleanReportStruct.f62245o = weAppExpireCleanReportStruct.b("Top3WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62246p = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 4:
                    weAppExpireCleanReportStruct.f62247q = weAppExpireCleanReportStruct.b("Top4WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62248r = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 5:
                    weAppExpireCleanReportStruct.f62249s = weAppExpireCleanReportStruct.b("Top5WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62250t = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 6:
                    weAppExpireCleanReportStruct.f62251u = weAppExpireCleanReportStruct.b("Top6WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62252v = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 7:
                    weAppExpireCleanReportStruct.f62253w = weAppExpireCleanReportStruct.b("Top7WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62254x = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 8:
                    weAppExpireCleanReportStruct.f62255y = weAppExpireCleanReportStruct.b("Top8WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.f62256z = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 9:
                    weAppExpireCleanReportStruct.A = weAppExpireCleanReportStruct.b("Top9WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.B = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
                case 10:
                    weAppExpireCleanReportStruct.C = weAppExpireCleanReportStruct.b("Top10WeappAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75413a, true);
                    weAppExpireCleanReportStruct.D = ((com.tencent.mm.plugin.appbrand.appcache.a3) F0.get(i29)).f75416d;
                    break;
            }
            i29 = i37;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj2 : S0) {
            if (((com.tencent.mm.plugin.appbrand.appcache.a3) obj2).f75415c == 4) {
                arrayList6.add(obj2);
            }
        }
        java.util.List F02 = kz5.n0.F0(arrayList6, new com.tencent.mm.plugin.appbrand.appcache.e3());
        weAppExpireCleanReportStruct.f62239i = F02.size();
        java.util.Iterator it16 = F02.iterator();
        long j69 = j66;
        while (it16.hasNext()) {
            j69 += ((com.tencent.mm.plugin.appbrand.appcache.a3) it16.next()).f75416d;
        }
        weAppExpireCleanReportStruct.f62240j = j69;
        int size2 = F02.size();
        if (size2 > 10) {
            i17 = 0;
            size2 = 10;
        } else {
            i17 = 0;
        }
        while (i17 < size2) {
            int i38 = i17 + 1;
            switch (i38) {
                case 1:
                    weAppExpireCleanReportStruct.E = weAppExpireCleanReportStruct.b("Top1GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.F = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 2:
                    weAppExpireCleanReportStruct.G = weAppExpireCleanReportStruct.b("Top2GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.H = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 3:
                    weAppExpireCleanReportStruct.I = weAppExpireCleanReportStruct.b("Top3GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.f62233J = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 4:
                    weAppExpireCleanReportStruct.K = weAppExpireCleanReportStruct.b("Top4GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.L = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 5:
                    weAppExpireCleanReportStruct.M = weAppExpireCleanReportStruct.b("Top5GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.N = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 6:
                    weAppExpireCleanReportStruct.O = weAppExpireCleanReportStruct.b("Top6GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.P = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 7:
                    weAppExpireCleanReportStruct.Q = weAppExpireCleanReportStruct.b("Top7GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.R = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 8:
                    weAppExpireCleanReportStruct.S = weAppExpireCleanReportStruct.b("Top8GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.T = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 9:
                    weAppExpireCleanReportStruct.U = weAppExpireCleanReportStruct.b("Top9GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.V = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
                case 10:
                    weAppExpireCleanReportStruct.W = weAppExpireCleanReportStruct.b("Top10GameAppId", ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75413a, true);
                    weAppExpireCleanReportStruct.X = ((com.tencent.mm.plugin.appbrand.appcache.a3) F02.get(i17)).f75416d;
                    break;
            }
            i17 = i38;
        }
        weAppExpireCleanReportStruct.f62234d = j59 / 86400;
        if (z18) {
            weAppExpireCleanReportStruct.Y = 2L;
            str = "cleanup";
        } else {
            weAppExpireCleanReportStruct.Y = 1L;
            str = "scanned";
        }
        weAppExpireCleanReportStruct.k();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        sb8.append(" deletedAppSize: ");
        sb8.append(weAppExpireCleanReportStruct.f62235e);
        sb8.append(" bytes, deletedCount: ");
        sb8.append(weAppExpireCleanReportStruct.f62236f);
        sb8.append(", deletedAppIds: ");
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(S0, 10));
        java.util.Iterator it17 = S0.iterator();
        while (it17.hasNext()) {
            arrayList7.add(((com.tencent.mm.plugin.appbrand.appcache.a3) it17.next()).f75413a);
        }
        sb8.append(arrayList7);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", sb8.toString());
    }
}
