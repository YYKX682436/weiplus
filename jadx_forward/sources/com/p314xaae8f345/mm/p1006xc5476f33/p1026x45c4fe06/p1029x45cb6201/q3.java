package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f157444d = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f157445e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad f157446f;

    public final void a() {
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class);
        if (d2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "calculateStorageByLastUsageAndReport, get messInfo Storage is null");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.Ai();
        java.util.Map z07 = d2Var.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d;
        long i17 = g0Var.i();
        long j17 = g0Var.j();
        long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_remove_outdated_wxapkg_threshold, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PkgABTest", "getThresholdOfOutdatedPkgLaunchPkgGap threshold: %d", java.lang.Integer.valueOf(Ni));
        if (Ni > 0) {
            Ni = java.lang.Math.max(5, Ni);
        }
        long j18 = Ni * 86400;
        java.util.Iterator it = ((java.util.ArrayList) Ai).iterator();
        long j19 = 0;
        long j27 = 0;
        long j28 = 0;
        long j29 = 0;
        long j37 = 0;
        long j38 = 0;
        long j39 = 0;
        long j47 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0) it.next();
            java.lang.String str = m0Var.f157798a;
            java.util.HashMap hashMap = (java.util.HashMap) z07;
            boolean containsKey = hashMap.containsKey(str);
            java.util.Iterator it6 = it;
            long j48 = m0Var.f157801d;
            if (!containsKey || hashMap.get(str) == null) {
                j19 += j48;
            } else {
                long longValue = ((java.lang.Long) hashMap.get(str)).longValue();
                if (j18 > 0 && i18 - longValue > j18) {
                    arrayList.add(str);
                }
                long j49 = i18 - longValue;
                if (j49 > 2592000) {
                    j47 += j48;
                } else if (j49 > 2160000) {
                    j39 += j48;
                } else if (j49 > 1728000) {
                    j38 += j48;
                } else if (j49 > 1296000) {
                    j37 += j48;
                } else if (j49 > 864000) {
                    j29 += j48;
                } else if (j49 > 432000) {
                    j28 += j48;
                } else {
                    j27 += j48;
                }
            }
            it = it6;
        }
        long j57 = j19 + j27 + j28 + j29 + j37 + j38 + j39 + j47;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6311xeb2cea90 c6311xeb2cea90 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6311xeb2cea90();
        c6311xeb2cea90.f136669d = 2L;
        c6311xeb2cea90.f136671f = i17;
        c6311xeb2cea90.f136672g = j17;
        c6311xeb2cea90.f136673h = j57;
        if (j57 > 0) {
            long j58 = 100;
            c6311xeb2cea90.f136674i = (j27 * j58) / j57;
            c6311xeb2cea90.f136675j = (j28 * j58) / j57;
            c6311xeb2cea90.f136676k = (j29 * j58) / j57;
            c6311xeb2cea90.f136677l = (j37 * j58) / j57;
            c6311xeb2cea90.f136678m = (j38 * j58) / j57;
            c6311xeb2cea90.f136679n = (j39 * j58) / j57;
            c6311xeb2cea90.f136680o = (j47 * j58) / j57;
            c6311xeb2cea90.f136681p = (j58 * j19) / j57;
        }
        c6311xeb2cea90.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "outdated pkg pending list size: %d", java.lang.Integer.valueOf(arrayList.size()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad adVar = this.f157446f;
        if (adVar != null) {
            adVar.f156429a.set(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad adVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i0.f159859a;
        this.f157446f = adVar2;
        adVar2.h(arrayList);
        this.f157446f = null;
    }

    public void b() {
        if (this.f157444d.get()) {
            throw new java.lang.InterruptedException();
        }
    }

    public final void c(java.util.List list) {
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k3.a();
        long j17 = a17.f157466a;
        double d17 = a17.f157467b;
        long j18 = a17.f157468c;
        long j19 = a17.f157469d;
        double d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158795g / 100.0f;
        boolean z17 = d17 > d18 && j17 > com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158794f * 1048576;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, usedPercent(%f), maxPercent(%f), usedBytes(%d), maxMB(%d), shouldCleanup=%B", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158794f), java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, cleanup by conditions usedPercent(%f) > maxPercent(%f)", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
            long j27 = (long) ((d17 - d18) * j18 * j19);
            if (j27 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "processByFilesystemUsage, calculated bytesToTrim is minus");
                return;
            }
            b();
            if (j27 > 0) {
                android.os.StatFs statFs = new android.os.StatFs(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c());
                android.os.StatFs statFs2 = new android.os.StatFs(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.d());
                long availableBlocks = (statFs.getAvailableBlocks() * statFs.getBlockSize()) + (statFs2.getAvailableBlocks() * statFs2.getBlockSize());
                if (availableBlocks >= 0 && availableBlocks <= j27) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6 g6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g6.class);
                    if (g6Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, lruStorage NULL", java.lang.Long.valueOf(j27));
                    } else {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, " %s, %s ASC", "hit", "hitTimeMS");
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.z5.f157629a) {
                            android.database.Cursor D = g6Var.f157086d.D("PkgUsageLRURecord", new java.lang.String[]{"appId", "type"}, null, null, null, null, format, 2);
                            if (D != null) {
                                if (D.moveToFirst()) {
                                    do {
                                        try {
                                            try {
                                                linkedList.add(android.util.Pair.create(D.getString(0), java.lang.Integer.valueOf(D.getInt(1))));
                                            } catch (java.lang.Exception e17) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy, read from cursor e = %s", e17);
                                            }
                                        } finally {
                                            D.close();
                                        }
                                    } while (D.moveToNext());
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                                    if (Di == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgPruneLRULogic", "trimBy %d, pkgStorage NULL", java.lang.Long.valueOf(j27));
                                    } else {
                                        if (this.f157444d.get()) {
                                            throw new java.lang.InterruptedException();
                                        }
                                        java.util.Iterator it = linkedList.iterator();
                                        long j28 = 0;
                                        int i17 = 0;
                                        loop1: while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            android.util.Pair pair = (android.util.Pair) it.next();
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3((java.lang.String) pair.first, ((java.lang.Integer) pair.second).intValue());
                                            if (!list.contains(j3Var)) {
                                                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var : Di.y((java.lang.String) pair.first, ((java.lang.Integer) pair.second).intValue(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.oa.ASC, "pkgPath")) {
                                                    j28 += com.p314xaae8f345.mm.vfs.w6.k(n9Var.f67183x55b471cc);
                                                    com.p314xaae8f345.mm.vfs.w6.h(n9Var.f67183x55b471cc);
                                                    i17++;
                                                    g6Var.y0((java.lang.String) pair.first, ((java.lang.Integer) pair.second).intValue());
                                                    if (this.f157444d.get()) {
                                                        throw new java.lang.InterruptedException();
                                                    }
                                                    if (j28 >= j27) {
                                                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9 c7078xde9ebcc9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7078xde9ebcc9();
                                                        c7078xde9ebcc9.f143863d = 3L;
                                                        c7078xde9ebcc9.f143866g = i17;
                                                        c7078xde9ebcc9.f143867h = 1L;
                                                        c7078xde9ebcc9.k();
                                                        break loop1;
                                                    }
                                                }
                                            } else {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgPruneLRULogic", "trimOffSize appPkg: %s is in white list, skip", j3Var);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j29 = j27 / 5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p3 p3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p3(this);
            if (j29 <= 0) {
                return;
            }
            android.os.StatFs statFs3 = new android.os.StatFs(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.c());
            android.os.StatFs statFs4 = new android.os.StatFs(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.d());
            long availableBlocks2 = (statFs3.getAvailableBlocks() * statFs3.getBlockSize()) + (statFs4.getAvailableBlocks() * statFs4.getBlockSize());
            if (availableBlocks2 < 0 || availableBlocks2 > j29) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k6.c(j29, p3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List r15) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.d(java.util.List):void");
    }

    public final void e() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (int i17 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().F()) {
            hashSet2.add(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Bi();
        if (Bi == null) {
            hashSet = null;
        } else {
            java.util.HashSet hashSet3 = new java.util.HashSet();
            for (m81.b bVar : ((java.util.concurrent.ConcurrentHashMap) Bi.f157530d).values()) {
                if (android.text.TextUtils.equals(bVar.f406221l, "@LibraryAppId")) {
                    hashSet3.add(java.lang.Integer.valueOf(bVar.f406222m));
                    if (bVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) {
                        hashSet3.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8) bVar).f157257r));
                    }
                }
            }
            hashSet = hashSet3;
        }
        long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m3 m3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m3(this, y7Var.f(true), i18, 86400L, hashSet2, hashSet);
        y7Var.a();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157599b) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = y7Var.g();
            if (g17 == null) {
                return;
            }
            java.util.List m17 = y7Var.m(g17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb c11661x55afe3eb = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) obj;
                if (!((c11661x55afe3eb.f156911e == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.j(true)) && ((java.lang.Boolean) m3Var.mo146xb9724478(c11661x55afe3eb)).booleanValue())) {
                    arrayList.add(obj);
                }
            }
            if (m17.size() - arrayList.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.p(g17, arrayList);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r3.close();
        b();
        r3 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r3.hasNext() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r4.f67844x55b471cc) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j3(r4.f67842x28d45f97, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r18.contains(r5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        b();
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r8 = com.p314xaae8f345.mm.vfs.z7.a(r4.f67844x55b471cc);
        r10 = r8.f294812f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r10 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        r14 = com.p314xaae8f345.mm.vfs.e8.l(r10, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r10.equals(r14) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        r8 = new com.p314xaae8f345.mm.vfs.z7(r8.f294810d, r8.f294811e, r14, r8.f294813g, r8.f294814h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r8 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(r8, null);
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r8.a() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        r8 = r8.f294799a.m(r8.f294800b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        r11 = r8.f294768e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (r5.toSeconds(r11) >= r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processEncrypted, delete record(%s %d %d)", r4.f67842x28d45f97, java.lang.Integer.valueOf(r4.f67845x2262335f), java.lang.Integer.valueOf(r4.f67846x8987ca93));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class)).mo9951xb06685ab(r4, new java.lang.String[0]);
        com.p314xaae8f345.mm.vfs.w6.f(r4.f67844x55b471cc);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processEncrypted appPkg: %s is in white list, skip", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r3.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6();
        r5.mo9015xbf5d97fd(r3);
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r3.moveToNext() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r18) {
        /*
            r17 = this;
            r17.b()
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b()
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig$PackageManager r2 = r2.N
            long r2 = r2.f158793e
            long r0 = r0 - r2
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.n6> r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class
            java.lang.Object r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r2)
            com.tencent.mm.plugin.appbrand.appcache.n6 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) r3
            android.database.Cursor r3 = r3.mo78085xb5882a6b()
            if (r3 == 0) goto Lf5
            boolean r4 = r3.isClosed()
            if (r4 == 0) goto L26
            goto Lf5
        L26:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            boolean r5 = r3.moveToFirst()
            if (r5 == 0) goto L42
        L31:
            com.tencent.mm.plugin.appbrand.appcache.m6 r5 = new com.tencent.mm.plugin.appbrand.appcache.m6
            r5.<init>()
            r5.mo9015xbf5d97fd(r3)
            r4.add(r5)
            boolean r5 = r3.moveToNext()
            if (r5 != 0) goto L31
        L42:
            r3.close()
            r17.b()
            java.util.Iterator r3 = r4.iterator()
        L4c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf5
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.appbrand.appcache.m6 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6) r4
            java.lang.String r5 = r4.f67844x55b471cc
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r5)
            if (r5 != 0) goto L61
            goto L4c
        L61:
            com.tencent.mm.plugin.appbrand.appcache.j3 r5 = new com.tencent.mm.plugin.appbrand.appcache.j3
            java.lang.String r6 = r4.f67842x28d45f97
            r7 = 0
            r5.<init>(r6, r7)
            r6 = r18
            boolean r8 = r6.contains(r5)
            java.lang.String r9 = "MicroMsg.AppBrand.PkgCleanupNewLogic"
            if (r8 == 0) goto L7d
            java.lang.String r4 = "processEncrypted appPkg: %s is in white list, skip"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r4, r5)
            goto L4c
        L7d:
            r17.b()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r8 = r4.f67844x55b471cc
            com.tencent.mm.vfs.z7 r8 = com.p314xaae8f345.mm.vfs.z7.a(r8)
            java.lang.String r10 = r8.f294812f
            if (r10 == 0) goto La7
            java.lang.String r14 = com.p314xaae8f345.mm.vfs.e8.l(r10, r7, r7)
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto La7
            com.tencent.mm.vfs.z7 r10 = new com.tencent.mm.vfs.z7
            java.lang.String r12 = r8.f294810d
            java.lang.String r13 = r8.f294811e
            java.lang.String r15 = r8.f294813g
            java.lang.String r8 = r8.f294814h
            r11 = r10
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r8 = r10
        La7:
            com.tencent.mm.vfs.b3 r10 = com.p314xaae8f345.mm.vfs.a3.f294314a
            r11 = 0
            com.tencent.mm.vfs.z2 r8 = r10.m(r8, r11)
            boolean r10 = r8.a()
            r11 = 0
            if (r10 != 0) goto Lb7
            goto Lc4
        Lb7:
            com.tencent.mm.vfs.q2 r10 = r8.f294799a
            java.lang.String r8 = r8.f294800b
            com.tencent.mm.vfs.x1 r8 = r10.m(r8)
            if (r8 != 0) goto Lc2
            goto Lc4
        Lc2:
            long r11 = r8.f294768e
        Lc4:
            long r10 = r5.toSeconds(r11)
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 >= 0) goto L4c
            java.lang.String r5 = r4.f67842x28d45f97
            int r8 = r4.f67845x2262335f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r10 = r4.f67846x8987ca93
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r8, r10}
            java.lang.String r8 = "processEncrypted, delete record(%s %d %d)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8, r5)
            java.lang.Object r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(r2)
            com.tencent.mm.plugin.appbrand.appcache.n6 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) r5
            java.lang.String[] r7 = new java.lang.String[r7]
            r5.mo9951xb06685ab(r4, r7)
            java.lang.String r4 = r4.f67844x55b471cc
            com.p314xaae8f345.mm.vfs.w6.f(r4)
            goto L4c
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.f(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.g():void");
    }

    public final void h() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.c());
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.l();
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
        if (G == null || G.length == 0) {
            r6Var.l();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            java.lang.String[] split = r6Var2.m82467xfb82e301().split(java.util.regex.Pattern.quote("-"));
            if (split == null || split.length < 2) {
                com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
            } else {
                java.lang.String str = split[0];
                if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61201x533437e.equals(str)) {
                    str = "@LibraryAppId";
                }
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(u46.l.s(split[1], 1), 0);
                int[] iArr = (int[]) hashMap.get(str);
                if (iArr == null) {
                    iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.o(true);
                    if (iArr == null) {
                        iArr = new int[]{0};
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processExpiredWebViewCodeCache, select_versionArray(%s), get(%s)", str, u46.a.c(iArr, "-1"));
                    hashMap.put(str, iArr);
                }
                if (!u46.a.a(iArr, P)) {
                    com.p314xaae8f345.mm.vfs.w6.h(r6Var2.o());
                    com.p314xaae8f345.mm.vfs.w6.g(r6Var2.o(), true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "processExpiredWebViewCodeCache, file(%s) deleted", r6Var2.o());
                }
            }
        }
    }

    public final void i() {
        b();
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        pm5.b bVar = null;
        final com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(com.p314xaae8f345.mm.vfs.z7.a("wcf://WxaCodePkgsCache"), null);
        if (m17.a()) {
            java.util.Map c17 = b3Var.c();
            com.p314xaae8f345.mm.vfs.q2 q2Var = m17.f294799a;
            java.lang.Iterable b17 = new com.p314xaae8f345.mm.vfs.h1(q2Var.y(), "${accountOtherList}", "account|accountSalt|accountSd").b(c17);
            java.lang.Iterable[] iterableArr = new java.lang.Iterable[2];
            final boolean z17 = false;
            iterableArr[0] = java.util.Collections.singleton(q2Var);
            if (b17 == null) {
                b17 = java.util.Collections.emptyList();
            }
            iterableArr[1] = b17;
            pm5.i iVar = new pm5.i(iterableArr);
            final java.util.HashSet hashSet = new java.util.HashSet();
            bVar = new pm5.b(iVar, new pm5.a() { // from class: com.tencent.mm.vfs.x6$$a
                @Override // pm5.a
                public final java.lang.Iterable a(java.lang.Object obj) {
                    com.p314xaae8f345.mm.vfs.q2 q2Var2 = (com.p314xaae8f345.mm.vfs.q2) obj;
                    if (!hashSet.add(q2Var2)) {
                        return null;
                    }
                    java.lang.String str = m17.f294800b;
                    return z17 ? com.p314xaae8f345.mm.vfs.e8.p(q2Var2, str, false, null) : q2Var2.mo82286x32b09e(str);
                }
            });
        }
        if (bVar != null) {
            java.util.Iterator it = bVar.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) it.next();
                if ("pkg".equals(x1Var.f294764a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "remove WxaCodePkgsCache path: %b", java.lang.Boolean.valueOf(x1Var.b(true)));
                }
            }
        }
    }

    public final void j() {
        try {
            ((t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class)).a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "processPersistentSyncCommands get exception %s", e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r2.moveToNext() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (r5.moveToFirst() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o9();
        r6.mo9015xbf5d97fd(r5);
        r1.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e7, code lost:
    
        if (r5.moveToNext() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r2.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z4();
        r4.mo9015xbf5d97fd(r2);
        r1.add(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [dm.l2, java.lang.Object, com.tencent.mm.plugin.appbrand.launching.z4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.k():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.l(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.q3.m():void");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCleanupNewLogic", "run() entered but storage not ready");
            return;
        }
        this.f157444d.set(false);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1007, 1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.PkgCleanupNewLogic", th6, "cleanup start report", new java.lang.Object[0]);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f157445e).iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
            d(arrayList);
            k();
            e();
            g();
            i();
            l(arrayList);
            f(arrayList);
            m();
            h();
            j();
            c(arrayList);
            a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o8.f157242a.c();
            if (c17 != null && c17.contains("expt_data")) {
                c17.W("expt_data");
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "interrupted %s", android.util.Log.getStackTraceString(e17));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.PkgCleanupNewLogic", th7, "process occur exception", new java.lang.Object[0]);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCleanupNewLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
