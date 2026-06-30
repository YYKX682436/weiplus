package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static long f253345a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p944x882e457a.u0 f253346b = new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.q();

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f253347c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.s f253348d;

    public static void a(org.json.JSONObject jSONObject) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                int i17 = 1;
                if (jSONObject.optInt("checkWeSportInstall", 0) != (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e() ? 1 : 0)) {
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
                        i17 = 0;
                    }
                    jSONObject.put("checkWeSportInstall", i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject.toString());
                    jx3.f.INSTANCE.mo68477x336bdfd8(323L, 5L, 1L, false);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static void b(boolean z17) {
        org.json.JSONObject c17 = c();
        try {
            c17.put("checkWeSportInstall", z17 ? 1 : 0);
        } catch (org.json.JSONException unused) {
        }
        java.lang.String jSONObject = c17.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject);
        ((ue4.r) i95.n0.c(ue4.r.class)).wi().c(jSONObject);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject c() {
        /*
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c
            if (r0 != 0) goto L8f
            com.tencent.mm.plugin.sport.model.z r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a
            com.tencent.mm.sdk.platformtools.o4 r0 = r0.c()
            java.lang.String r1 = "KEY_LAST_REQUEST_CONFIG_STRING"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.u(r1, r2)
            java.lang.String r1 = "decodeString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 != 0) goto L2a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2a
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2a
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = r1     // Catch: java.lang.Exception -> L2a
            a(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "server config"
        L2a:
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c
            java.lang.String r1 = "MicroMsg.Sport.SportConfigLogic"
            if (r0 != 0) goto L72
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.res.AssetManager r0 = r0.getAssets()
            r2 = 0
            java.lang.String r3 = "sport_config.json"
            java.io.InputStream r2 = r0.open(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            byte[] r3 = kk.f.b(r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r2 == 0) goto L64
            goto L61
        L4f:
            r0 = move-exception
            goto L6c
        L51:
            r0 = move-exception
            java.lang.String r3 = "get assets sport config json"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L4f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r0, r3, r4)     // Catch: java.lang.Throwable -> L4f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f
            r3.<init>()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L64
        L61:
            r2.close()     // Catch: java.io.IOException -> L64
        L64:
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = r3
            a(r3)
            java.lang.String r2 = "asset"
            goto L72
        L6c:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L71
        L71:
            throw r0
        L72:
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c
            if (r0 != 0) goto L80
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = r0
            java.lang.String r2 = "new"
        L80:
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "get sport config from %s: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
        L8f:
            org.json.JSONObject r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c():org.json.JSONObject");
    }

    public static boolean d() {
        if (f253345a == 0) {
            f253345a = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.a("KEY_LAST_REQUEST_CONFIG_TIME_LONG", 0L);
        }
        long c17 = c01.id.c();
        long j17 = f253345a;
        if (c17 - j17 <= 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportConfigLogic", "last request time is %s", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f(j17));
            return false;
        }
        f253345a = c01.id.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.d("KEY_LAST_REQUEST_CONFIG_TIME_LONG", f253345a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportConfigLogic", "start to request sport config");
        gm0.j1.d().a(1947, f253346b);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.i());
        return true;
    }
}
