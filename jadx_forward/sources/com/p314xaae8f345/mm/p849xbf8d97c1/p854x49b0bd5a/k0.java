package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

/* loaded from: classes12.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 f150306a = new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f150307b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f150308c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f150309d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f150310e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f150311f;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f150307b = timeUnit.toMillis(1L);
        f150308c = timeUnit.toMillis(3L);
        f150309d = timeUnit.toMillis(5L);
        f150310e = timeUnit.toMillis(15L);
        f150311f = timeUnit.toMillis(35L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var, com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr, int i17, int i18, long j17) {
        java.util.List R6;
        k0Var.getClass();
        java.lang.String str = "";
        if ((c4720x9bbc2403Arr.length == 0) == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.monitor.AppBackgroundMemory", "MemInfo is empty!!");
            return;
        }
        try {
            com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("hprofs");
            if (b17 != null) {
                b17.q(new android.os.CancellationSignal());
            }
            lr0.c.b(com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8.C10889xf2b6a72.f150380d, false, i17, null, 5, null);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.AppBackgroundMemory", th6, "", new java.lang.Object[0]);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("xweb-sdk", com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19);
            jSONObject.put("xweb-apk", org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
            ft.e eVar = (ft.e) i95.n0.c(ft.e.class);
            com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k0 k0Var2 = f150306a;
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
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.monitor.AppBackgroundMemory", "IPC get MM leaked Process");
                android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str2, null, com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.a.class);
                java.io.Serializable serializable = bundle.getSerializable("GetLeakedActivities");
                if (serializable != null) {
                    java.util.Map map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
                    if (map != null) {
                        jSONObject.put("Activity", k0Var2.k(map));
                    }
                }
                int i19 = bundle.getInt("TPCount", 0);
                if (i19 > 0) {
                    jSONObject.put(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131743k, i19);
                }
                int i27 = bundle.getInt("FlutterEngineCount", 0);
                if (i27 > 0) {
                    jSONObject.put("Flutter", i27);
                }
                java.lang.String string = bundle.getString("FlutterEngineBizNames", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                if (!r26.n0.N(string)) {
                    jSONObject.put("FlutterBiz", string);
                }
                java.lang.String string2 = bundle.getString("MBBizList", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                if (!r26.n0.N(string2)) {
                    jSONObject.put("MBBiz", string2);
                }
                int i28 = bundle.getInt("LiteAppEngineCount", 0);
                if (i28 > 0) {
                    jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0, i28);
                }
                java.lang.String string3 = bundle.getString("LiteAppIDs", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                if (true ^ r26.n0.N(string3)) {
                    jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca, string3);
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
        ri.i0 i0Var = ri.k0.f477453a;
        java.lang.String b18 = ri.l0.b(k0Var.l(c4720x9bbc2403Arr));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k;
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d c4725x9d1e779d = ((com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403) kz5.z.L(c4720x9bbc2403Arr)).f134634i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4725x9d1e779d);
        java.lang.String b19 = ri.l0.b(c4725x9d1e779d.a());
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
        ri.j0 j0Var = new ri.j0(i17, "All", 0, 0, 0L, 0L, 0L, 0, null, 0, null, i18, b18, 0L, 0L, 0L, null, null, 0, 0, 0, 0, z17 ? 1 : 0, j17, b19, null, str3, 0, 0, str4, str5, 0, 0, -1707087876, 1, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.monitor.AppBackgroundMemory", j0Var.m162460x9616526c());
        i0Var.a(j0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.monitor.AppBackgroundMemory", "report24556 done");
    }

    public final ji.h b() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150307b, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.g(j17), null, 160, null);
    }

    public final ji.h c() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150307b, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.i(j17), null, 160, null);
    }

    public final ji.h d() {
        long j17 = (long) (900.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150307b, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.k(j17), null, 160, null);
    }

    public final ji.h e() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150308c, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.s(j17), null, 160, null);
    }

    public final ji.h f() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150308c, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.u(j17), null, 160, null);
    }

    public final ji.h g() {
        long j17 = (long) (900.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, 0L, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.w(j17), null, 164, null);
    }

    public final ji.h h() {
        long j17 = (long) (500.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150309d, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.y(j17), null, 160, null);
    }

    public final ji.h i() {
        long j17 = (long) (700.0d * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495, f150309d, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.a0(j17), null, 160, null);
    }

    public final ji.h j() {
        long j17 = (long) (1.3d * 1024 * 1024);
        return new ji.h(true, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4682x5dbe6c9e.f19972x4fbc8495, 0L, j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a.g0(j17), null, 164, null);
    }

    public final org.json.JSONObject k(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, entry.getKey());
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

    public final org.json.JSONObject l(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403[] c4720x9bbc2403Arr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONObject.put("count", c4720x9bbc2403Arr.length);
            jSONObject.put("detail", jSONArray);
            java.util.ArrayList arrayList = new java.util.ArrayList(c4720x9bbc2403Arr.length);
            for (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 : c4720x9bbc2403Arr) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d = c4720x9bbc2403.f134630e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d);
                    jSONObject2.put("process", c4722x6f76cf9d.f134642e);
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4722x6f76cf9d c4722x6f76cf9d2 = c4720x9bbc2403.f134630e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4722x6f76cf9d2);
                    jSONObject2.put("pid", c4722x6f76cf9d2.f134641d);
                    com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e = c4720x9bbc2403.f134635m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4723x52a73b7e);
                    jSONObject2.put("amsPss", c4723x52a73b7e.a());
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
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, bVar.getF146571d());
                jSONObject.put("size", bVar.getF146572e().size());
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
