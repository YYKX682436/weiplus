package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class g0 {
    public g0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        g0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "deep clean include temp file: " + bool);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            try {
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + str2 + '/';
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str3);
                com.p314xaae8f345.mm.vfs.w6.g(str3, true);
                if (r6Var.m()) {
                    r6Var.l();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean Flatten appId=%s e=%s", str2, e17);
            }
        }
        g0Var.k(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RemoveUsageTask", "removeStorageSync with appId(%s)", str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "appId is null");
            return;
        }
        java.lang.String f17 = k91.k4.f(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RemoveUsageTask", "username is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.b(f17, str2, 0);
        }
    }

    public final void a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean list is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "start clean appbrand storage, size: " + list.size());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String j17 = gm0.j1.b().j();
        if (j17 == null || j17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad adVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i0.f159859a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad adVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i0.f159859a;
        adVar2.h(list);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        try {
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    adVar2.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
                    f(this, j17, str, null, 4, null);
                }
            } finally {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList interrupted %s", android.util.Log.getStackTraceString(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList process occur exception %s", th6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "batchCleanStorageByAppIdList cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:5:0x00b7, B:7:0x00c7, B:8:0x00cc, B:10:0x00d2, B:12:0x00e0, B:14:0x00e8, B:15:0x00ef), top: B:4:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138 A[Catch: Exception -> 0x017e, TryCatch #1 {Exception -> 0x017e, blocks: (B:18:0x0128, B:20:0x0138, B:21:0x013e, B:23:0x0144, B:25:0x014e, B:26:0x0154, B:28:0x0175), top: B:17:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0175 A[Catch: Exception -> 0x017e, TRY_LEAVE, TryCatch #1 {Exception -> 0x017e, blocks: (B:18:0x0128, B:20:0x0138, B:21:0x013e, B:23:0x0144, B:25:0x014e, B:26:0x0154, B:28:0x0175), top: B:17:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6 A[Catch: Exception -> 0x01ec, TryCatch #2 {Exception -> 0x01ec, blocks: (B:31:0x0196, B:33:0x01a6, B:34:0x01ac, B:36:0x01b2, B:38:0x01bc, B:39:0x01c2, B:41:0x01e3), top: B:30:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e3 A[Catch: Exception -> 0x01ec, TRY_LEAVE, TryCatch #2 {Exception -> 0x01ec, blocks: (B:31:0x0196, B:33:0x01a6, B:34:0x01ac, B:36:0x01b2, B:38:0x01bc, B:39:0x01c2, B:41:0x01e3), top: B:30:0x0196 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0214 A[Catch: Exception -> 0x025a, TryCatch #4 {Exception -> 0x025a, blocks: (B:44:0x0204, B:46:0x0214, B:47:0x021a, B:49:0x0220, B:51:0x022a, B:53:0x0232, B:54:0x0239), top: B:43:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232 A[Catch: Exception -> 0x025a, TryCatch #4 {Exception -> 0x025a, blocks: (B:44:0x0204, B:46:0x0214, B:47:0x021a, B:49:0x0220, B:51:0x022a, B:53:0x0232, B:54:0x0239), top: B:43:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0282 A[Catch: Exception -> 0x02c8, TryCatch #8 {Exception -> 0x02c8, blocks: (B:57:0x0272, B:59:0x0282, B:60:0x0288, B:62:0x028e, B:64:0x0298, B:66:0x02a0, B:67:0x02a7), top: B:56:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a0 A[Catch: Exception -> 0x02c8, TryCatch #8 {Exception -> 0x02c8, blocks: (B:57:0x0272, B:59:0x0282, B:60:0x0288, B:62:0x028e, B:64:0x0298, B:66:0x02a0, B:67:0x02a7), top: B:56:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0302 A[Catch: Exception -> 0x0348, TryCatch #7 {Exception -> 0x0348, blocks: (B:69:0x02e0, B:71:0x0302, B:72:0x0308, B:74:0x030e, B:76:0x0318, B:78:0x0320, B:79:0x0327), top: B:68:0x02e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0320 A[Catch: Exception -> 0x0348, TryCatch #7 {Exception -> 0x0348, blocks: (B:69:0x02e0, B:71:0x0302, B:72:0x0308, B:74:0x030e, B:76:0x0318, B:78:0x0320, B:79:0x0327), top: B:68:0x02e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:5:0x00b7, B:7:0x00c7, B:8:0x00cc, B:10:0x00d2, B:12:0x00e0, B:14:0x00e8, B:15:0x00ef), top: B:4:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0370 A[Catch: Exception -> 0x03b8, TryCatch #6 {Exception -> 0x03b8, blocks: (B:81:0x0360, B:83:0x0370, B:84:0x0376, B:86:0x037c, B:88:0x0388, B:90:0x038f), top: B:80:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038f A[Catch: Exception -> 0x03b8, TRY_LEAVE, TryCatch #6 {Exception -> 0x03b8, blocks: (B:81:0x0360, B:83:0x0370, B:84:0x0376, B:86:0x037c, B:88:0x0388, B:90:0x038f), top: B:80:0x0360 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(java.lang.String r18, java.lang.String r19, java.lang.Boolean r20) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0.b(java.lang.String, java.lang.String, java.lang.Boolean):long");
    }

    public final long c(java.lang.String uinStr, java.lang.String appId) {
        long j17;
        java.lang.Long l17;
        java.lang.Long l18;
        java.lang.Long l19;
        long j18;
        java.lang.Long l27;
        long j19;
        java.lang.Long l28;
        java.lang.Long l29;
        java.lang.String str;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s18;
        com.p314xaae8f345.mm.vfs.r6[] I;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uinStr, "uinStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s8 s8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s8) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s8.class);
        s8Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r8 r8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r8(s8Var, appId);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.b());
        if (!r6Var.m() || !r6Var.y() || (I = r6Var.I(r8Var)) == null || I.length <= 0) {
            j17 = 0;
        } else {
            j17 = 0;
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : I) {
                com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(r6Var2.o());
                if (m17 != null) {
                    j17 += m17.f294767d;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaJsCacheStorage", "get size file:%s", r6Var2.m82467xfb82e301());
            }
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        long longValue = valueOf.longValue() + 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "js code cache size = " + valueOf + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gb) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gb.class)).getClass();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec(0L);
        java.lang.String h17 = gm0.j1.u().h();
        if (!h17.endsWith("/")) {
            h17 = h17.concat("/");
        }
        java.lang.String str2 = h17 + "appbrand/loadingurl/" + appId;
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(str2);
        if (r6Var3.m() && r6Var3.y() && (s18 = com.p314xaae8f345.mm.vfs.w6.s(str2, true)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s18) {
                if (x1Var != null) {
                    c19769x48b92ec.f38866x6ac9171 += x1Var.f294767d;
                }
            }
        }
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath.concat("/");
        }
        java.lang.String str3 = absolutePath + "tencent/MicroMsg/appbrand/loadingurl";
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(str3);
        if (r6Var4.m() && r6Var4.y() && (s17 = com.p314xaae8f345.mm.vfs.w6.s(str3, true)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : s17) {
                if (x1Var2 != null) {
                    c19769x48b92ec.f38866x6ac9171 += x1Var2.f294767d;
                }
            }
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(c19769x48b92ec.f38866x6ac9171);
        long longValue2 = longValue + valueOf2.longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "preload image cache size = " + valueOf2 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qb qbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c;
        com.p314xaae8f345.mm.vfs.r6 r6Var5 = new com.p314xaae8f345.mm.vfs.r6(qbVar.c());
        if (r6Var5.m() && r6Var5.y()) {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s19 = com.p314xaae8f345.mm.vfs.w6.s(qbVar.c(), true);
            if (s19 != null) {
                long j27 = 0;
                for (com.p314xaae8f345.mm.vfs.x1 x1Var3 : s19) {
                    j27 += x1Var3 != null && (str = x1Var3.f294765b) != null && r26.i0.y(str, appId, false) ? x1Var3.f294767d : 0L;
                }
                l29 = java.lang.Long.valueOf(j27);
            } else {
                l29 = null;
            }
            longValue2 += l29 != null ? l29.longValue() : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "webview code cache size = " + l29 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis3));
        }
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s27 = com.p314xaae8f345.mm.vfs.w6.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a(), false);
        if (s27 != null) {
            long j28 = 0;
            for (com.p314xaae8f345.mm.vfs.x1 x1Var4 : s27) {
                if (x1Var4.f294769f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, x1Var4.f294765b)) {
                    java.lang.Iterable s28 = com.p314xaae8f345.mm.vfs.w6.s(x1Var4.f294764a, true);
                    if (s28 != null) {
                        long j29 = 0;
                        for (java.util.Iterator it = s28.iterator(); it.hasNext(); it = it) {
                            j29 += ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294767d;
                        }
                        l28 = java.lang.Long.valueOf(j29);
                    } else {
                        l28 = null;
                    }
                    if (l28 != null) {
                        j19 = l28.longValue();
                        j28 += j19;
                    }
                }
                j19 = 0;
                j28 += j19;
            }
            l17 = java.lang.Long.valueOf(j28);
        } else {
            l17 = null;
        }
        long longValue3 = longValue2 + (l17 != null ? l17.longValue() : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "v8 wasm cache size = " + l17 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis4));
        long currentTimeMillis5 = java.lang.System.currentTimeMillis();
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s29 = com.p314xaae8f345.mm.vfs.w6.s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a(), false);
        if (s29 != null) {
            long j37 = 0;
            for (com.p314xaae8f345.mm.vfs.x1 x1Var5 : s29) {
                if (x1Var5.f294769f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, x1Var5.f294765b)) {
                    java.lang.Iterable s37 = com.p314xaae8f345.mm.vfs.w6.s(x1Var5.f294764a, true);
                    if (s37 != null) {
                        java.util.Iterator it6 = s37.iterator();
                        long j38 = 0;
                        while (it6.hasNext()) {
                            j38 += ((com.p314xaae8f345.mm.vfs.x1) it6.next()).f294767d;
                        }
                        l27 = java.lang.Long.valueOf(j38);
                    } else {
                        l27 = null;
                    }
                    if (l27 != null) {
                        j18 = l27.longValue();
                        j37 += j18;
                    }
                }
                j18 = 0;
                j37 += j18;
            }
            l18 = java.lang.Long.valueOf(j37);
        } else {
            l18 = null;
        }
        long longValue4 = longValue3 + (l18 != null ? l18.longValue() : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "mb shader cache size = " + l18 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis5));
        long currentTimeMillis6 = java.lang.System.currentTimeMillis();
        java.lang.Long valueOf3 = java.lang.Long.valueOf(((k81.a) ((j81.k) i95.n0.c(j81.k.class))).Bi(appId));
        long longValue5 = longValue4 + valueOf3.longValue();
        java.lang.Iterable s38 = com.p314xaae8f345.mm.vfs.w6.s(new te.a(uinStr, appId).f499297d, true);
        if (s38 != null) {
            java.util.Iterator it7 = s38.iterator();
            long j39 = 0;
            while (it7.hasNext()) {
                j39 += ((com.p314xaae8f345.mm.vfs.x1) it7.next()).f294767d;
            }
            l19 = java.lang.Long.valueOf(j39);
        } else {
            l19 = null;
        }
        long longValue6 = longValue5 + (l19 != null ? l19.longValue() : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "xnet model cache size = " + valueOf3 + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis6));
        return longValue6;
    }

    public final long d(java.lang.String appId, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String j17 = gm0.j1.b().j();
        if (j17 == null || j17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
            return 0L;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        return b(j17, appId, bool);
    }

    public final void e(java.lang.String uin, java.lang.String appId, java.lang.Boolean bool) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uin, "uin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "clean include temp file: " + bool);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            try {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + appId + '/';
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
                com.p314xaae8f345.mm.vfs.w6.g(str, true);
                if (r6Var.m()) {
                    r6Var.l();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean Flatten appId=%s e=%s", appId, e17);
            }
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.i(uin, appId).mo49676x192e2029();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean NonFlatten appId=%s e=%s", appId, e18);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.j(uin, appId).mo49676x192e2029();
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean open data NonFlatten appId=%s e=%s", appId, e19);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.k(uin, appId).mo49676x192e2029();
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean private data NonFlatten appId=%s e=%s", appId, e27);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.c(uin, appId).mo49676x192e2029();
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean client data NonFlatten appId=%s e=%s", appId, e28);
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.l(uin, appId).mo49676x192e2029();
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean SinglePageNotFlatten appId=%s e=%s", appId, e29);
        }
        try {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e() + appId + "/blobTmp/";
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str2);
            com.p314xaae8f345.mm.vfs.w6.g(str2, true);
            if (r6Var2.m()) {
                r6Var2.l();
            }
        } catch (java.lang.Exception e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "clean flattenBlobPath appId=%s e=%s", appId, e37);
        }
        k(appId);
        java.util.Collection collection = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.f157642a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appId)) {
            com.p314xaae8f345.mm.vfs.w6.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.f(appId));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).a(appId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.putBoolean("appbrand_enable_file_storage_space_statistics_for_".concat(appId), false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.k4.J(appId);
        ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).wi(appId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAudioCache", "[clear] result" + com.p314xaae8f345.mm.vfs.w6.g(new te.a(uin, appId).f499297d, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0084, code lost:
    
        if (r1 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0.g():java.util.List");
    }

    public final java.lang.String h(java.lang.String str) {
        int K = str != null ? r26.n0.K(str, '$', 0, false, 6, null) : 0;
        if (K > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            str = str.substring(0, K);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        }
        return str == null ? "" : str;
    }

    public final long i() {
        java.lang.String j17 = gm0.j1.b().j();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.vfs.r6[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.b();
        if (b17 == null) {
            b17 = new com.p314xaae8f345.mm.vfs.r6[0];
        }
        long j18 = 0;
        for (com.p314xaae8f345.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.i(o17) != null) {
                j18 += com.p314xaae8f345.mm.vfs.w6.m(o17) != null ? (int) r7.f294767d : 0;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        return j18 + b(j17, "@LibraryAppId", java.lang.Boolean.TRUE) + c(j17, "@LibraryAppId");
    }

    public final long j() {
        java.lang.String j17 = gm0.j1.b().j();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.vfs.r6[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.b();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.util.List wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) c17).wi();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(kz5.d0.q(wi6, 10));
        java.util.Iterator it = wi6.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) it.next()).f157313d);
        }
        if (b17 == null) {
            b17 = new com.p314xaae8f345.mm.vfs.r6[0];
        }
        long j18 = 0;
        for (com.p314xaae8f345.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 p17 = Di.p(o17);
            if (p17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.i(o17);
                p17 = i17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f(i17) : null;
            }
            if (p17 != null && arrayList.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d.h(p17.f67177x28d45f97))) {
                j18 += com.p314xaae8f345.mm.vfs.w6.m(o17) != null ? (int) r9.f294767d : 0;
            }
        }
        for (java.lang.String str : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
            j18 = j18 + b(j17, str, java.lang.Boolean.TRUE) + c(j17, str);
        }
        return j18;
    }

    public final void k(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.p874xaefb6cc9.j1 j1Var = com.p314xaae8f345.mm.p874xaefb6cc9.j1.f150617a;
            java.lang.String c17 = j1Var.c(str);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c17);
            if (r6Var.m()) {
                com.p314xaae8f345.mm.vfs.w6.g(c17, true);
                if (!r6Var.m()) {
                    r6Var = null;
                }
                if (r6Var != null) {
                    r6Var.l();
                }
            }
            j1Var.d(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "Failed to clean wva files for appId=" + str, e17);
        }
    }
}
