package aw1;

/* loaded from: classes12.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final aw1.a1 f14523e = new aw1.a1(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f14524f = kz5.c0.i("CheckResUpdate", "XWebEngine");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f14525g = kz5.c0.i("image2", "video", "voice2", "attachment", "record", "Download", "c2c_origin_image", "c2c_origin_video", "c2c");

    /* renamed from: h, reason: collision with root package name */
    public static long f14526h;

    /* renamed from: d, reason: collision with root package name */
    public final int f14527d;

    public g1(int i17) {
        this.f14527d = i17;
    }

    public final void a(java.util.HashMap hashMap, java.lang.String str, long j17) {
        if (str == null) {
            str = "null";
        }
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, java.lang.Long.valueOf(j17));
            return;
        }
        java.lang.Object obj = hashMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        hashMap.put(str, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + j17));
    }

    public final int b(int i17, boolean z17) {
        if ((65536 & i17) != 0) {
            return 0;
        }
        if (z17 && (1073741824 & i17) != 0) {
            return 0;
        }
        if ((i17 & 4096) != 0) {
            return 2;
        }
        int i18 = i17 & 4095;
        return (i18 == 1 || i18 == 12 || i18 == 13) ? 0 : 1;
    }

    public final java.lang.String c(java.util.Map map) {
        try {
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.s(map)).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReportStorageDetailedTask", e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }

    public final java.util.concurrent.FutureTask d(java.util.HashMap hashMap) {
        return new java.util.concurrent.FutureTask(new aw1.c1(this, hashMap));
    }

    public final java.util.concurrent.FutureTask e(java.util.HashMap hashMap) {
        return new java.util.concurrent.FutureTask(new aw1.d1(this, hashMap));
    }

    public final boolean f() {
        if (z65.c.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_ui_report_storage_details_c2c_details", "0", false, true));
    }

    public final boolean g() {
        if (z65.c.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_ui_report_storage_details_c2c_scan", "0", false, true));
    }

    public final boolean h() {
        if (z65.c.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_clean_ui_report_storage_details_cache_other", "0", false, true));
    }

    public final java.util.Map i(java.util.HashMap hashMap) {
        return kz5.c1.q(kz5.n0.F0(kz5.e1.v(hashMap), new aw1.f1()));
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashMap hashMap;
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.HashMap hashMap2;
        long j17;
        java.util.HashMap hashMap3;
        int i17;
        java.lang.String str4;
        java.lang.String str5 = "<get-values>(...)";
        try {
            long q17 = com.tencent.mm.sdk.platformtools.o4.L().q("ReportStorageDetailedTask_Time", 0L);
            boolean a17 = com.tencent.mm.sdk.platformtools.s9.a();
            long currentTimeMillis = java.lang.System.currentTimeMillis() - q17;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "CleanWxTaskLite, lastTime = " + q17 + ", debugEnv = " + a17);
            if (!a17 && currentTimeMillis < 86400000) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "CleanWxTaskLite task start");
            boolean g17 = g();
            boolean f17 = f();
            boolean h17 = h();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(g17);
            sb6.append('/');
            sb6.append(f17);
            sb6.append('/');
            sb6.append(h17);
            java.lang.String sb7 = sb6.toString();
            boolean z27 = com.tencent.mars.xlog.Log.getLogLevel() == 1;
            boolean z28 = a17 && z27;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "debugLogLevel = " + z27 + ", printLog = " + z28 + ", willScanC2CDir = " + g17 + ", willScanC2CDirDetail = " + f17 + ", willScanCacheOther = " + h17);
            jx3.f.INSTANCE.d(25464, java.lang.Integer.valueOf(this.f14527d), -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", sb7);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            aw1.b0.f14494i.b();
            com.tencent.mm.vfs.b2.i(java.lang.System.currentTimeMillis());
            java.util.HashMap hashMap4 = new java.util.HashMap();
            java.util.HashMap hashMap5 = new java.util.HashMap();
            java.util.HashMap hashMap6 = new java.util.HashMap();
            java.util.HashMap hashMap7 = new java.util.HashMap();
            java.util.HashMap hashMap8 = new java.util.HashMap();
            aw1.e1 e1Var = new aw1.e1();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (g17) {
                java.util.Iterator it = f14525g.iterator();
                while (it.hasNext()) {
                    java.util.Iterator it6 = it;
                    java.lang.String str6 = (java.lang.String) it.next();
                    java.lang.String str7 = sb7;
                    if (!kotlin.jvm.internal.o.b(str6, "image2")) {
                        str4 = str5;
                        if (!kotlin.jvm.internal.o.b(str6, "video")) {
                            linkedHashMap.put(str6, new java.util.concurrent.FutureTask(new aw1.b1(str6)));
                        } else if (f17) {
                            linkedHashMap.put(str6, e(hashMap5));
                        } else {
                            linkedHashMap.put(str6, new java.util.concurrent.FutureTask(new aw1.b1(str6)));
                        }
                    } else if (f17) {
                        linkedHashMap.put(str6, d(hashMap5));
                        str4 = str5;
                    } else {
                        str4 = str5;
                        linkedHashMap.put(str6, new java.util.concurrent.FutureTask(new aw1.b1(str6)));
                    }
                    sb7 = str7;
                    it = it6;
                    str5 = str4;
                }
                str2 = str5;
                str3 = sb7;
                for (java.util.Iterator it7 = linkedHashMap.entrySet().iterator(); it7.hasNext(); it7 = it7) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it7.next();
                    java.lang.String str8 = (java.lang.String) entry.getKey();
                    ((ku5.t0) ku5.t0.f312615d).h((java.util.concurrent.FutureTask) entry.getValue(), str8 + "-Scan-Task");
                }
            } else {
                str2 = "<get-values>(...)";
                str3 = sb7;
            }
            java.util.List a18 = f14523e.a();
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            long longValue = ((java.lang.Number) a18.get(4)).longValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "specialSize = " + longValue);
            java.util.Iterator it8 = ((pm5.b) com.tencent.mm.vfs.b2.g(true, e1Var)).iterator();
            long j18 = 0;
            while (true) {
                pm5.c cVar = (pm5.c) it8;
                java.util.Iterator it9 = it8;
                if (!cVar.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.k6 k6Var = (com.tencent.mm.vfs.k6) cVar.next();
                java.lang.String b17 = k6Var.b();
                java.util.HashMap hashMap9 = hashMap5;
                int c17 = k6Var.c();
                java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
                long j19 = longValue;
                long j27 = k6Var.a().f213234d;
                int b18 = b(c17, k6Var.a().f213236f);
                java.util.HashMap hashMap10 = hashMap6;
                java.util.HashMap hashMap11 = hashMap4;
                if (z28) {
                    z17 = z28;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    hashMap = hashMap8;
                    sb8.append("fsName = ");
                    sb8.append(b17);
                    sb8.append(", tag = ");
                    sb8.append(c17);
                    sb8.append(", path = ");
                    sb8.append(k6Var.a().f213231a);
                    sb8.append(", size = ");
                    sb8.append(j27);
                    sb8.append(", cleanLevel = ");
                    sb8.append(b18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb8.toString());
                } else {
                    hashMap = hashMap8;
                    z17 = z28;
                }
                if (b18 > 0) {
                    a(hashMap7, b17, j27);
                    if (!a17 && !h17) {
                        z18 = a17;
                        z19 = h17;
                        hashMap2 = hashMap11;
                        hashMap8 = hashMap;
                    }
                    java.util.List i18 = kz5.c0.i(0, 2, 3, 16);
                    int i19 = c17 & 4095;
                    if (i19 >= 21) {
                        z18 = a17;
                        i17 = 0;
                    } else {
                        i17 = i19;
                        z18 = a17;
                    }
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    z19 = h17;
                    sb9.append("cache other fsName = ");
                    sb9.append(b17);
                    sb9.append(", tag = ");
                    sb9.append(c17);
                    sb9.append(", path = ");
                    sb9.append(k6Var.a().f213231a);
                    sb9.append(", size = ");
                    sb9.append(j27);
                    sb9.append(", category = ");
                    sb9.append(i19);
                    sb9.append(", idx = ");
                    sb9.append(i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb9.toString());
                    if (i18.contains(java.lang.Integer.valueOf(i17))) {
                        hashMap8 = hashMap;
                        a(hashMap8, b17, j27);
                    } else {
                        hashMap8 = hashMap;
                    }
                    hashMap2 = hashMap11;
                } else {
                    z18 = a17;
                    z19 = h17;
                    hashMap8 = hashMap;
                    java.lang.String name = k6Var.a().f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (r26.i0.A(name, "EnMicroMsg.db", false, 2, null)) {
                        hashMap2 = hashMap11;
                        a(hashMap2, "main_db", j27);
                    } else {
                        hashMap2 = hashMap11;
                        if (r26.i0.A(name, "FTS5IndexMicroMsg_encrypt.db", false, 2, null)) {
                            a(hashMap2, "fts_db", j27);
                        } else if (r26.i0.A(name, "WxFileIndex.db", false, 2, null)) {
                            a(hashMap2, "index_db", j27);
                        } else {
                            if (k6Var.a().f213236f) {
                                j17 = j18;
                                hashMap3 = hashMap10;
                                a(hashMap3, "dir_size", j27);
                            } else {
                                if (r26.i0.o(name, ".db", false, 2, null)) {
                                    hashMap3 = hashMap10;
                                    a(hashMap3, name, j27);
                                } else {
                                    hashMap3 = hashMap10;
                                    if (j19 <= 0 || !kz5.n0.O(f14524f, b17)) {
                                        long j28 = j18;
                                        j18 = kotlin.jvm.internal.o.b(b17, com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_DIRECTORY_NAME) ? j28 + j27 : j28;
                                        a(hashMap3, b17, j27);
                                        hashMap4 = hashMap2;
                                        hashMap6 = hashMap3;
                                        it8 = it9;
                                        hashMap5 = hashMap9;
                                        linkedHashMap2 = linkedHashMap3;
                                        z28 = z17;
                                        a17 = z18;
                                        h17 = z19;
                                        longValue = j19;
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "specialSize, name = " + name + ", size = " + j27);
                                    }
                                }
                                j17 = j18;
                            }
                            hashMap4 = hashMap2;
                            hashMap6 = hashMap3;
                            j18 = j17;
                            it8 = it9;
                            hashMap5 = hashMap9;
                            linkedHashMap2 = linkedHashMap3;
                            z28 = z17;
                            a17 = z18;
                            h17 = z19;
                            longValue = j19;
                        }
                    }
                }
                j17 = j18;
                hashMap3 = hashMap10;
                hashMap4 = hashMap2;
                hashMap6 = hashMap3;
                j18 = j17;
                it8 = it9;
                hashMap5 = hashMap9;
                linkedHashMap2 = linkedHashMap3;
                z28 = z17;
                a17 = z18;
                h17 = z19;
                longValue = j19;
            }
            long j29 = longValue;
            java.util.LinkedHashMap linkedHashMap4 = linkedHashMap2;
            java.util.HashMap hashMap12 = hashMap6;
            java.util.HashMap hashMap13 = hashMap5;
            long j37 = j18;
            java.util.HashMap hashMap14 = hashMap4;
            for (java.util.Map.Entry entry2 : linkedHashMap4.entrySet()) {
                java.lang.String str9 = (java.lang.String) entry2.getKey();
                java.lang.Object obj = ((java.util.concurrent.FutureTask) entry2.getValue()).get();
                kotlin.jvm.internal.o.f(obj, "get(...)");
                a(hashMap14, str9, ((java.lang.Number) obj).longValue());
            }
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "scan done duration = " + currentTimeMillis3);
            java.util.Collection values = hashMap7.values();
            java.lang.String str10 = str2;
            kotlin.jvm.internal.o.f(values, str10);
            long J0 = kz5.n0.J0(values);
            java.util.Collection values2 = hashMap14.values();
            kotlin.jvm.internal.o.f(values2, str10);
            long J02 = kz5.n0.J0(values2);
            java.util.Collection values3 = hashMap12.values();
            kotlin.jvm.internal.o.f(values3, str10);
            try {
                long J03 = kz5.n0.J0(values3);
                try {
                    java.util.Collection values4 = hashMap8.values();
                    kotlin.jvm.internal.o.f(values4, str10);
                    long J04 = kz5.n0.J0(values4);
                    long j38 = J0 + J02 + J03;
                    java.util.Map i27 = i(hashMap7);
                    java.util.Map i28 = i(hashMap14);
                    java.util.Map i29 = i(hashMap13);
                    java.util.Map i37 = i(hashMap12);
                    java.util.Map i38 = i(hashMap8);
                    long j39 = J03 - j37;
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    try {
                        sb10.append("onDone cacheSizeMap = ");
                        sb10.append(i27);
                        sb10.append(", size = ");
                        sb10.append(J0);
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb10.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "onDone chattingSizeMap = " + i28 + ", size = " + J02);
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                            sb11.append("onDone sortedChattingDetailMap = ");
                            sb11.append(i29);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb11.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "onDone otherSizeMap = " + i37 + ", size = " + J03 + ", tinkerSize = " + j37 + ", otherSizeWithoutTinker = " + j39);
                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                            sb12.append("onDone sortedCacheOtherMap = ");
                            sb12.append(i38);
                            sb12.append(", size = ");
                            sb12.append(J04);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", sb12.toString());
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "onDone, totalSize = " + j38);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "onDone accDetailedInfo = " + a18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ReportStorageDetailedTask", "accDetailedInfo = " + kz5.n0.g0(a18, null, null, null, 0, null, null, 63, null));
                            try {
                                long q18 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_EnMicroMsg", -1L);
                                jx3.f fVar = jx3.f.INSTANCE;
                                java.lang.Object[] objArr = new java.lang.Object[22];
                                try {
                                    objArr[0] = java.lang.Integer.valueOf(this.f14527d);
                                    objArr[1] = java.lang.Long.valueOf(currentTimeMillis3);
                                    objArr[2] = java.lang.Long.valueOf(j38);
                                    objArr[3] = java.lang.Long.valueOf(J02);
                                    objArr[4] = java.lang.Long.valueOf(J03);
                                    objArr[5] = a18.get(0);
                                    objArr[6] = a18.get(1);
                                    objArr[7] = a18.get(2);
                                    objArr[8] = a18.get(3);
                                    objArr[9] = java.lang.Long.valueOf(q18);
                                    objArr[10] = java.lang.Long.valueOf(J0);
                                    objArr[11] = java.lang.Long.valueOf(j29);
                                    objArr[12] = c(i27);
                                    objArr[13] = c(i28);
                                    objArr[14] = c(i37);
                                    objArr[15] = c(i29);
                                    objArr[16] = c(i38);
                                    objArr[17] = str3;
                                    objArr[18] = "";
                                    objArr[19] = "";
                                    objArr[20] = java.lang.Long.valueOf(j39);
                                    objArr[21] = java.lang.Long.valueOf(J04);
                                    fVar.d(25464, objArr);
                                    com.tencent.mm.sdk.platformtools.o4.L().B("ReportStorageDetailedTask_Time", java.lang.System.currentTimeMillis());
                                    com.tencent.mm.sdk.platformtools.o4.L().G("ReportStorageDetailedTask_TO_RUN", false);
                                    java.lang.Object obj2 = hashMap12.get("mmkv");
                                    if (obj2 == null) {
                                        obj2 = 0L;
                                    }
                                    if (((java.lang.Number) obj2).longValue() >= 150000000) {
                                        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                                        sb13.append("onDone mmkvTooLarge, size=");
                                        java.lang.Object obj3 = hashMap12.get("mmkv");
                                        if (obj3 == null) {
                                            obj3 = 0L;
                                        }
                                        sb13.append(((java.lang.Number) obj3).longValue());
                                        str = "MicroMsg.ReportStorageDetailedTask";
                                        try {
                                            com.tencent.mars.xlog.Log.i(str, sb13.toString());
                                            java.util.List<jz5.l> v17 = kz5.e1.v(hashMap12);
                                            java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap(e06.p.b(kz5.b1.d(kz5.d0.q(v17, 10)), 16));
                                            for (jz5.l lVar : v17) {
                                                java.lang.Object c18 = lVar.c();
                                                java.lang.Object d17 = lVar.d();
                                                kotlin.jvm.internal.o.e(d17, "null cannot be cast to non-null type kotlin.Any");
                                                linkedHashMap5.put(c18, d17);
                                            }
                                            java.lang.String[] strArr = new java.lang.String[2];
                                            strArr[0] = "mmkvTooLarge";
                                            java.lang.Object obj4 = hashMap12.get("mmkv");
                                            if (obj4 == null) {
                                                obj4 = 0L;
                                            }
                                            strArr[1] = java.lang.String.valueOf(((java.lang.Number) obj4).longValue());
                                            ap.b.a("errMmkvSize", null, linkedHashMap5, strArr);
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            com.tencent.mars.xlog.Log.e(str, "report error t = " + th.getMessage());
                                        }
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    str = "MicroMsg.ReportStorageDetailedTask";
                                    com.tencent.mars.xlog.Log.e(str, "report error t = " + th.getMessage());
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            str = "MicroMsg.ReportStorageDetailedTask";
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        str = "MicroMsg.ReportStorageDetailedTask";
                        com.tencent.mars.xlog.Log.e(str, "report error t = " + th.getMessage());
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                str = "MicroMsg.ReportStorageDetailedTask";
            }
        } catch (java.lang.Throwable th13) {
            th = th13;
            str = "MicroMsg.ReportStorageDetailedTask";
        }
    }
}
