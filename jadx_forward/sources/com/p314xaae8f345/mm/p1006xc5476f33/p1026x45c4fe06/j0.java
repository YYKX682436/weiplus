package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@j95.b
/* loaded from: classes7.dex */
public final class j0 extends i95.w implements ft.w3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 f159976d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f159977e = "_1123949441_";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f159978f = "snapshot";

    public static final java.util.List Ai() {
        long j17;
        java.util.LinkedHashMap linkedHashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var2 = f159976d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "start calculate appbrand storage usage");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.lf lfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.lf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f0.f159570d);
        java.util.List g17 = g0Var2.g();
        java.lang.String j18 = gm0.j1.b().j();
        if (j18 == null || j18.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "prepare to flush mess info column");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class);
            if (d2Var != null) {
                d2Var.y0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.yc ycVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h0.f159788a;
            ycVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCalculateLogic", "run() entered but storage not ready");
            } else {
                ycVar.f173956a.set(false);
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                try {
                    try {
                        java.util.List d17 = ycVar.d();
                        ycVar.b(hashMap, d17);
                        ycVar.a(hashMap, d17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    } finally {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    }
                } catch (java.lang.InterruptedException e17) {
                    j17 = elapsedRealtime;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "interrupted %s", android.util.Log.getStackTraceString(e17));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgCalculateLogic", "calculate occur exception %s", th6);
                }
            }
            j17 = elapsedRealtime;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(hashMap.size()));
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.bd) entry.getValue()).f158541b));
            }
            java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().a();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next()).f129217a);
            }
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            try {
                try {
                    java.util.Iterator it6 = ((java.util.ArrayList) g17).iterator();
                    while (it6.hasNext()) {
                        k91.v5 v5Var = (k91.v5) it6.next();
                        ycVar.c();
                        java.lang.String str = v5Var.f68904x28d45f97;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        long b17 = g0Var2.b(j18, str, java.lang.Boolean.TRUE) + g0Var2.c(j18, str);
                        if (linkedHashMap2.containsKey(str)) {
                            java.lang.Integer num = (java.lang.Integer) linkedHashMap2.get(str);
                            if (num != null) {
                                g0Var = g0Var2;
                                i17 = num.intValue();
                                linkedHashMap = linkedHashMap2;
                            } else {
                                i17 = 0;
                                linkedHashMap = linkedHashMap2;
                                g0Var = g0Var2;
                            }
                            long j19 = b17 + i17;
                            if (j19 != 0) {
                                java.lang.String field_brandIconURL = v5Var.f68910xea1bd3d4;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_brandIconURL, "field_brandIconURL");
                                java.lang.String field_nickname = v5Var.f68913x21f9b213;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_nickname, "field_nickname");
                                lfVar.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0(str, field_brandIconURL, field_nickname, j19, java.lang.Boolean.valueOf(arrayList.contains(str))));
                            }
                        } else {
                            linkedHashMap = linkedHashMap2;
                            g0Var = g0Var2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandFileCleaner", "find wxapkg record, but no pkg file, appId: " + str);
                        }
                        linkedHashMap2 = linkedHashMap;
                        g0Var2 = g0Var;
                    }
                } finally {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                }
            } catch (java.lang.InterruptedException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo interrupted %s", android.util.Log.getStackTraceString(e18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
                return lfVar;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo process occur exception %s", th7);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
                return lfVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
        }
        return lfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.wi(java.lang.String, boolean):void");
    }
}
