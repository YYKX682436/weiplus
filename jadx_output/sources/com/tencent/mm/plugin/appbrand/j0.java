package com.tencent.mm.plugin.appbrand;

@j95.b
/* loaded from: classes7.dex */
public final class j0 extends i95.w implements ft.w3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.g0 f78443d = new com.tencent.mm.plugin.appbrand.g0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f78444e = "_1123949441_";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f78445f = "snapshot";

    public static final java.util.List Ai() {
        long j17;
        java.util.LinkedHashMap linkedHashMap;
        com.tencent.mm.plugin.appbrand.g0 g0Var;
        int i17;
        com.tencent.mm.plugin.appbrand.g0 g0Var2 = f78443d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "start calculate appbrand storage usage");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.lf lfVar = new com.tencent.mm.plugin.appbrand.lf(com.tencent.mm.plugin.appbrand.f0.f78037d);
        java.util.List g17 = g0Var2.g();
        java.lang.String j18 = gm0.j1.b().j();
        if (j18 == null || j18.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "prepare to flush mess info column");
            com.tencent.mm.plugin.appbrand.appusage.d2 d2Var = (com.tencent.mm.plugin.appbrand.appusage.d2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.d2.class);
            if (d2Var != null) {
                d2Var.y0();
            }
            com.tencent.mm.plugin.appbrand.yc ycVar = com.tencent.mm.plugin.appbrand.h0.f78255a;
            ycVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            if (com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgCalculateLogic", "run() entered but storage not ready");
            } else {
                ycVar.f92423a.set(false);
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                try {
                    try {
                        java.util.List d17 = ycVar.d();
                        ycVar.b(hashMap, d17);
                        ycVar.a(hashMap, d17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    } finally {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "run() cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                    }
                } catch (java.lang.InterruptedException e17) {
                    j17 = elapsedRealtime;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgCalculateLogic", "interrupted %s", android.util.Log.getStackTraceString(e17));
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgCalculateLogic", "calculate occur exception %s", th6);
                }
            }
            j17 = elapsedRealtime;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(hashMap.size()));
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.bd) entry.getValue()).f77008b));
            }
            java.util.List a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().a();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.luggage.sdk.processes.s) it.next()).f47684a);
            }
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            try {
                try {
                    java.util.Iterator it6 = ((java.util.ArrayList) g17).iterator();
                    while (it6.hasNext()) {
                        k91.v5 v5Var = (k91.v5) it6.next();
                        ycVar.c();
                        java.lang.String str = v5Var.field_appId;
                        kotlin.jvm.internal.o.d(j18);
                        kotlin.jvm.internal.o.d(str);
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
                                java.lang.String field_brandIconURL = v5Var.field_brandIconURL;
                                kotlin.jvm.internal.o.f(field_brandIconURL, "field_brandIconURL");
                                java.lang.String field_nickname = v5Var.field_nickname;
                                kotlin.jvm.internal.o.f(field_nickname, "field_nickname");
                                lfVar.add(new com.tencent.mm.plugin.appbrand.appstorage.m0(str, field_brandIconURL, field_nickname, j19, java.lang.Boolean.valueOf(arrayList.contains(str))));
                            }
                        } else {
                            linkedHashMap = linkedHashMap2;
                            g0Var = g0Var2;
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandFileCleaner", "find wxapkg record, but no pkg file, appId: " + str);
                        }
                        linkedHashMap2 = linkedHashMap;
                        g0Var2 = g0Var;
                    }
                } finally {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                }
            } catch (java.lang.InterruptedException e18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo interrupted %s", android.util.Log.getStackTraceString(e18));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
                return lfVar;
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo process occur exception %s", th7);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "getAllAppBrandStorageInfo cost %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
                return lfVar;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "calculate appbrand storage usage time cost: " + (android.os.SystemClock.elapsedRealtime() - j17) + "ms, record: " + lfVar.size());
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.j0.wi(java.lang.String, boolean):void");
    }
}
