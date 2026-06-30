package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.matrix.monitor.k0 f68773a = new com.tencent.mm.matrix.monitor.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f68774b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f68775c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f68776d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f68777e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f68778f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f68774b = timeUnit.toMillis(1L);
        f68775c = timeUnit.toMillis(3L);
        f68776d = timeUnit.toMillis(5L);
        f68777e = timeUnit.toMillis(15L);
        f68778f = timeUnit.toMillis(35L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.tencent.mm.matrix.monitor.k0 k0Var, com.tencent.matrix.util.MemInfo[] memInfoArr, int i17, int i18, long j17) {
        java.util.List R6;
        k0Var.getClass();
        java.lang.String str = "";
        if ((memInfoArr.length == 0) == true) {
            com.tencent.mars.xlog.Log.e("MicroMsg.monitor.AppBackgroundMemory", "MemInfo is empty!!");
            return;
        }
        try {
            com.tencent.mm.vfs.q2 b17 = ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b("hprofs");
            if (b17 != null) {
                b17.q(new android.os.CancellationSignal());
            }
            lr0.c.b(com.tencent.mm.matrix.trigger.RemoteTrigger.f68847d, false, i17, null, 5, null);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th6, "", new java.lang.Object[0]);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("xweb-sdk", com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE);
            jSONObject.put("xweb-apk", org.xwalk.core.XWalkEnvironment.d());
            ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
            com.tencent.mm.matrix.monitor.k0 k0Var2 = f68773a;
            if (eVar != null && (R6 = eVar.R6()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : R6) {
                    if (((ft.b) obj).a()) {
                        arrayList.add(obj);
                    }
                }
                org.json.JSONArray m17 = k0Var2.m(arrayList);
                if (m17 != null) {
                    jSONObject.put("appbrand", m17);
                }
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            if (com.tencent.mm.ipcinvoker.d0.g(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.monitor.AppBackgroundMemory", "IPC get MM leaked Process");
                android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(str2, null, com.tencent.mm.matrix.monitor.a.class);
                java.io.Serializable serializable = bundle.getSerializable("GetLeakedActivities");
                if (serializable != null) {
                    java.util.Map map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
                    if (map != null) {
                        jSONObject.put("Activity", k0Var2.k(map));
                    }
                }
                int i19 = bundle.getInt("TPCount", 0);
                if (i19 > 0) {
                    jSONObject.put(com.tencent.mapsdk.internal.kx.f50210k, i19);
                }
                int i27 = bundle.getInt("FlutterEngineCount", 0);
                if (i27 > 0) {
                    jSONObject.put("Flutter", i27);
                }
                java.lang.String string = bundle.getString("FlutterEngineBizNames", "");
                kotlin.jvm.internal.o.d(string);
                if (!r26.n0.N(string)) {
                    jSONObject.put("FlutterBiz", string);
                }
                java.lang.String string2 = bundle.getString("MBBizList", "");
                kotlin.jvm.internal.o.d(string2);
                if (!r26.n0.N(string2)) {
                    jSONObject.put("MBBiz", string2);
                }
                int i28 = bundle.getInt("LiteAppEngineCount", 0);
                if (i28 > 0) {
                    jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, i28);
                }
                java.lang.String string3 = bundle.getString("LiteAppIDs", "");
                kotlin.jvm.internal.o.d(string3);
                if (true ^ r26.n0.N(string3)) {
                    jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID, string3);
                }
                int i29 = bundle.getInt("BitmapCount", 0);
                long j18 = bundle.getLong("BitmapSize", 0L);
                if (j18 > 30000000) {
                    jSONObject.put("BmCount", i29);
                    jSONObject.put("BmSize", j18);
                }
            }
            str = ri.l0.b(jSONObject);
        } catch (java.lang.Throwable th7) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th7, "", new java.lang.Object[0]);
        }
        java.lang.String str3 = str;
        ri.i0 i0Var = ri.k0.f395920a;
        java.lang.String b18 = ri.l0.b(k0Var.l(memInfoArr));
        boolean z17 = com.tencent.mm.sdk.platformtools.z.f193115k;
        com.tencent.matrix.util.SystemInfo systemInfo = ((com.tencent.matrix.util.MemInfo) kz5.z.L(memInfoArr)).f53101i;
        kotlin.jvm.internal.o.d(systemInfo);
        java.lang.String b19 = ri.l0.b(systemInfo.a());
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193109e;
        kotlin.jvm.internal.o.d(str4);
        kotlin.jvm.internal.o.d(str5);
        ri.j0 j0Var = new ri.j0(i17, "All", 0, 0, 0L, 0L, 0L, 0, null, 0, null, i18, b18, 0L, 0L, 0L, null, null, 0, 0, 0, 0, z17 ? 1 : 0, j17, b19, null, str3, 0, 0, str4, str5, 0, 0, -1707087876, 1, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.monitor.AppBackgroundMemory", j0Var.toString());
        i0Var.a(j0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.monitor.AppBackgroundMemory", "report24556 done");
    }

    public final ji.h b() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68774b, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.g(j17), null, 160, null);
    }

    public final ji.h c() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68774b, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.i(j17), null, 160, null);
    }

    public final ji.h d() {
        long j17 = (long) (900.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68774b, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.k(j17), null, 160, null);
    }

    public final ji.h e() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68775c, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.s(j17), null, 160, null);
    }

    public final ji.h f() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68775c, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.u(j17), null, 160, null);
    }

    public final ji.h g() {
        long j17 = (long) (900.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, 0L, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.w(j17), null, 164, null);
    }

    public final ji.h h() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68776d, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.y(j17), null, 160, null);
    }

    public final ji.h i() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE, f68776d, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.a0(j17), null, 160, null);
    }

    public final ji.h j() {
        long j17 = (long) (1.3d * 1024 * 1024);
        return new ji.h(true, com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE, 0L, j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0, new com.tencent.mm.matrix.monitor.g0(j17), null, 164, null);
    }

    public final org.json.JSONObject k(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, entry.getKey());
                jSONObject2.put("C", ((java.lang.Number) entry.getValue()).intValue());
                jSONArray.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("total", i17);
            jSONObject3.put("leak", jSONArray);
            return jSONObject3;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th6, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }

    public final org.json.JSONObject l(com.tencent.matrix.util.MemInfo[] memInfoArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", memInfoArr.length);
            jSONObject.put("detail", jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(memInfoArr.length);
            for (com.tencent.matrix.util.MemInfo memInfo : memInfoArr) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.tencent.matrix.util.ProcessInfo processInfo = memInfo.f53097e;
                    kotlin.jvm.internal.o.d(processInfo);
                    jSONObject2.put("process", processInfo.f53109e);
                    com.tencent.matrix.util.ProcessInfo processInfo2 = memInfo.f53097e;
                    kotlin.jvm.internal.o.d(processInfo2);
                    jSONObject2.put("pid", processInfo2.f53108d);
                    com.tencent.matrix.util.PssInfo pssInfo = memInfo.f53102m;
                    kotlin.jvm.internal.o.d(pssInfo);
                    jSONObject2.put("amsPss", pssInfo.a());
                } catch (java.lang.Throwable th6) {
                    oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th6, "", new java.lang.Object[0]);
                }
                arrayList.add(jSONObject2);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
        } catch (java.lang.Throwable th7) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th7, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public final org.json.JSONArray m(java.util.List list) {
        try {
            if (list.isEmpty()) {
                return null;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ft.b bVar = (ft.b) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONArray.put(jSONObject);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, bVar.getF65038d());
                jSONObject.put("size", bVar.getF65039e().size());
                for (java.lang.String str : bVar.c()) {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(str);
                    jSONObject.put("app", jSONArray2);
                }
            }
            return jSONArray;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
