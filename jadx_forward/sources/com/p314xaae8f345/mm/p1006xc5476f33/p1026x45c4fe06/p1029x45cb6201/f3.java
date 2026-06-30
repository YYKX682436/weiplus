package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f157055d = new java.util.concurrent.atomic.AtomicBoolean();

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
        long j38 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158793e;
        int i18 = 1;
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_expired_cleanup_enable, 0) == 1;
        long j39 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z2.f157620a;
        long j47 = 0;
        if (j39 > 0) {
            z18 = true;
            Ni = j39;
            j38 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "expiredTime: " + Ni + " seconds, expiredCleanupEnable: " + z18);
        if (Ni <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("launchAppTime > 0 and launchAppTime < " + (c01.id.e() - Ni));
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "select %s from %s left join %s on %s where %s order by %s", java.util.Arrays.copyOf(new java.lang.Object[]{"WxaAttributesTable.appId,WxaAttributesTable.nickname,case when WxaAttributesTable.lastLaunchAppTime > 0 then WxaAttributesTable.lastLaunchAppTime else AppBrandLauncherLayoutItem.updateTime end as launchAppTime,WxaAttributesTable.appInfo,AppBrandLauncherLayoutItem.versionType", "WxaAttributesTable", "AppBrandLauncherLayoutItem", "WxaAttributesTable.username = AppBrandLauncherLayoutItem.brandId", sb6.toString(), "launchAppTime"}, 6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        x51.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
        int i19 = 4;
        if (Ri != null) {
            android.database.Cursor f17 = Ri.f(format, new java.lang.String[0], 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "rawQuery(...)");
            try {
                if (f17.moveToFirst()) {
                    while (true) {
                        java.lang.String string = f17.getString(0);
                        f17.getString(i18);
                        f17.getLong(2);
                        k91.j5 a17 = k91.j5.a(f17.getString(3));
                        boolean c17 = a17 != null ? a17.c() : false;
                        int i27 = a17 != null ? a17.f387162d : 0;
                        int i28 = f17.getInt(i19);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && !c17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("@LibraryAppId", string)) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3(string, i28, i27));
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
        java.util.List a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a18, 10));
        java.util.Iterator it7 = ((java.util.ArrayList) a18).iterator();
        while (it7.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it7.next()).f129217a);
        }
        kz5.h0.B(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b3(arrayList2));
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c18, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.util.List wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) c18).wi();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(wi6, 10));
        java.util.Iterator it8 = wi6.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) it8.next()).f157313d);
        }
        kz5.h0.B(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c3(arrayList3));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("expiredAppIdLists: ");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it9.next()).f156946a);
        }
        sb7.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", sb7.toString());
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.f157055d.get()) {
            throw new java.lang.InterruptedException();
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3 a3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it10.next();
            java.lang.String str2 = a3Var.f156946a;
            if (!hashMap3.containsKey(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                java.util.List n17 = Di != null ? Di.n(str2) : null;
                if ((n17 == null || n17.isEmpty()) ? true : z17) {
                    j17 = Ni;
                    hashMap2 = hashMap3;
                    j19 = j38;
                    it = it10;
                    j27 = j47;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete app: " + str2);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.util.Iterator it11 = n17.iterator();
                    long j48 = 0;
                    while (it11.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9) it11.next();
                        java.lang.String field_appId = n9Var.f67177x28d45f97;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
                        java.util.Iterator it12 = it11;
                        if (!r26.i0.n(field_appId, "$__PLUGINCODE__", false) && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
                            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(n9Var.f67180x8ecd6328) || j38 <= 0) {
                                j28 = Ni;
                                it6 = it10;
                            } else {
                                long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - j38);
                                it6 = it10;
                                long l18 = com.p314xaae8f345.mm.vfs.w6.l(n9Var.f67183x55b471cc);
                                if (l18 <= 0 || l18 <= millis) {
                                    j28 = Ni;
                                } else {
                                    j28 = Ni;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", n9Var.f67177x28d45f97 + " record not expired, lastModified: " + l18 + " mills, minDateToKeep: " + millis + " mills, withoutContactClearSeconds: " + j38 + " seconds");
                                }
                            }
                            com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(n9Var.f67183x55b471cc);
                            if (m17 != null) {
                                j37 = m17.f294767d;
                                j29 = j48;
                            } else {
                                j29 = j48;
                                j37 = 0;
                            }
                            j48 = j29 + j37;
                            if (z18) {
                                com.p314xaae8f345.mm.vfs.w6.h(n9Var.f67183x55b471cc);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().a(n9Var);
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete pkgSize: " + j49 + " bytes");
                        j18 = j49 + 0;
                    } else {
                        j18 = 0;
                    }
                    java.lang.String j57 = gm0.j1.b().j();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    long d17 = g0Var.d(str2, bool) + ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).Bi(str2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j57);
                    j19 = j38;
                    java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(new te.a(j57, str2).f499297d, true);
                    if (s17 != null) {
                        long j58 = 0;
                        for (java.util.Iterator it13 = s17.iterator(); it13.hasNext(); it13 = it13) {
                            j58 += ((com.p314xaae8f345.mm.vfs.x1) it13.next()).f294767d;
                        }
                        l17 = java.lang.Long.valueOf(j58);
                    } else {
                        l17 = null;
                    }
                    long longValue = d17 + (l17 != null ? l17.longValue() : 0L);
                    if (longValue > 0) {
                        hashMap = hashMap3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete fsSize: " + longValue + " bytes");
                        j18 += longValue;
                        if (z18) {
                            g0Var.e(j57, str2, bool);
                        }
                    } else {
                        hashMap = hashMap3;
                    }
                    j27 = 0;
                    if (j18 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", "delete totalSize: " + j18 + " bytes, cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
                        a3Var.f156949d = j18;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.List S0 = kz5.n0.S0(values);
        if (S0.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7070xb07381e0 c7070xb07381e0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7070xb07381e0();
        c7070xb07381e0.f143769f = S0.size();
        java.util.Iterator it14 = S0.iterator();
        long j67 = j66;
        while (it14.hasNext()) {
            j67 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it14.next()).f156949d;
        }
        c7070xb07381e0.f143768e = j67;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : S0) {
            if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) obj).f156948c == 4)) {
                arrayList5.add(obj);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList5, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d3());
        c7070xb07381e0.f143770g = F0.size();
        java.util.Iterator it15 = F0.iterator();
        long j68 = j66;
        while (it15.hasNext()) {
            j68 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it15.next()).f156949d;
        }
        c7070xb07381e0.f143771h = j68;
        int size = F0.size();
        if (size > 10) {
            size = 10;
        }
        int i29 = 0;
        while (i29 < size) {
            int i37 = i29 + 1;
            switch (i37) {
                case 1:
                    c7070xb07381e0.f143774k = c7070xb07381e0.b("Top1WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143775l = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 2:
                    c7070xb07381e0.f143776m = c7070xb07381e0.b("Top2WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143777n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 3:
                    c7070xb07381e0.f143778o = c7070xb07381e0.b("Top3WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143779p = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 4:
                    c7070xb07381e0.f143780q = c7070xb07381e0.b("Top4WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143781r = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 5:
                    c7070xb07381e0.f143782s = c7070xb07381e0.b("Top5WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143783t = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 6:
                    c7070xb07381e0.f143784u = c7070xb07381e0.b("Top6WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143785v = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 7:
                    c7070xb07381e0.f143786w = c7070xb07381e0.b("Top7WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143787x = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 8:
                    c7070xb07381e0.f143788y = c7070xb07381e0.b("Top8WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.f143789z = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 9:
                    c7070xb07381e0.A = c7070xb07381e0.b("Top9WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.B = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
                case 10:
                    c7070xb07381e0.C = c7070xb07381e0.b("Top10WeappAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156946a, true);
                    c7070xb07381e0.D = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F0.get(i29)).f156949d;
                    break;
            }
            i29 = i37;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj2 : S0) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) obj2).f156948c == 4) {
                arrayList6.add(obj2);
            }
        }
        java.util.List F02 = kz5.n0.F0(arrayList6, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e3());
        c7070xb07381e0.f143772i = F02.size();
        java.util.Iterator it16 = F02.iterator();
        long j69 = j66;
        while (it16.hasNext()) {
            j69 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it16.next()).f156949d;
        }
        c7070xb07381e0.f143773j = j69;
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
                    c7070xb07381e0.E = c7070xb07381e0.b("Top1GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.F = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 2:
                    c7070xb07381e0.G = c7070xb07381e0.b("Top2GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 3:
                    c7070xb07381e0.I = c7070xb07381e0.b("Top3GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.f143766J = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 4:
                    c7070xb07381e0.K = c7070xb07381e0.b("Top4GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 5:
                    c7070xb07381e0.M = c7070xb07381e0.b("Top5GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.N = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 6:
                    c7070xb07381e0.O = c7070xb07381e0.b("Top6GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.P = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 7:
                    c7070xb07381e0.Q = c7070xb07381e0.b("Top7GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.R = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 8:
                    c7070xb07381e0.S = c7070xb07381e0.b("Top8GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.T = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 9:
                    c7070xb07381e0.U = c7070xb07381e0.b("Top9GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.V = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
                case 10:
                    c7070xb07381e0.W = c7070xb07381e0.b("Top10GameAppId", ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156946a, true);
                    c7070xb07381e0.X = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) F02.get(i17)).f156949d;
                    break;
            }
            i17 = i38;
        }
        c7070xb07381e0.f143767d = j59 / 86400;
        if (z18) {
            c7070xb07381e0.Y = 2L;
            str = "cleanup";
        } else {
            c7070xb07381e0.Y = 1L;
            str = "scanned";
        }
        c7070xb07381e0.k();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        sb8.append(" deletedAppSize: ");
        sb8.append(c7070xb07381e0.f143768e);
        sb8.append(" bytes, deletedCount: ");
        sb8.append(c7070xb07381e0.f143769f);
        sb8.append(", deletedAppIds: ");
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(S0, 10));
        java.util.Iterator it17 = S0.iterator();
        while (it17.hasNext()) {
            arrayList7.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) it17.next()).f156946a);
        }
        sb8.append(arrayList7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpiredAppBrandCleanupLogic", sb8.toString());
    }
}
