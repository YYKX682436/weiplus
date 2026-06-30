package su4;

/* loaded from: classes12.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f494561a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f494562b;

    /* renamed from: c, reason: collision with root package name */
    public static su4.y1 f494563c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.HashMap f494564d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f494565e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p944x882e457a.u0 f494566f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f494561a = hashMap;
        f494562b = new java.util.HashMap();
        hashMap.put("zh_CN", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_CN_STRING);
        hashMap.put("zh_HK", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_HK_STRING);
        hashMap.put("zh_TW", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ZH_TW_STRING);
        hashMap.put("en", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_EN_STRING);
        hashMap.put("ar", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_AR_STRING);
        hashMap.put("de", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_DE_STRING);
        hashMap.put("de_DE", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_DE_DE_STRING);
        hashMap.put("es", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ES_STRING);
        hashMap.put("fr", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_FR_STRING);
        hashMap.put("he", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_HE_STRING);
        hashMap.put("hi", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_HI_STRING);
        hashMap.put(dm.i4.f66865x76d1ec5a, com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_ID_STRING);
        hashMap.put("in", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IN_STRING);
        hashMap.put("it", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IT_STRING);
        hashMap.put("iw", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_IW_STRING);
        hashMap.put("ja", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_JA_STRING);
        hashMap.put("ko", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_KO_STRING);
        hashMap.put("lo", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_LO_STRING);
        hashMap.put("ms", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_MS_STRING);
        hashMap.put("my", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_MY_STRING);
        hashMap.put("pl", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_PL_STRING);
        hashMap.put("pt", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_PT_STRING);
        hashMap.put("ru", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_RU_STRING);
        hashMap.put("th", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_TH_STRING);
        hashMap.put("tr", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_TR_STRING);
        hashMap.put("vi", com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_VI_STRING);
        f494565e = "";
        f494566f = new su4.m2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static java.lang.String a() {
        java.io.InputStream inputStream;
        ?? r07 = "webconfig/default.";
        android.content.res.AssetManager assets = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets();
        java.io.Closeable closeable = null;
        java.lang.String str = null;
        try {
            try {
                inputStream = assets.open("webconfig/default." + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                try {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N1(inputStream);
                    r07 = inputStream;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchConfigLogic", e, e.getMessage(), new java.lang.Object[0]);
                    r07 = inputStream;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r07);
                    return str;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                closeable = r07;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
            throw th;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(r07);
        return str;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.u3 b(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.u3) f494561a.get(str);
        return u3Var == null ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEB_SEARCH_CONFIG_EN_STRING : u3Var;
    }

    public static org.json.JSONObject c(java.lang.String str) {
        java.util.Map map = f494562b;
        if (((java.util.HashMap) map).containsKey(str) && ((java.util.HashMap) map).get(str) != null) {
            return (org.json.JSONObject) ((java.util.HashMap) map).get(str);
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ((java.util.HashMap) map).put(str, jSONObject);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchConfigLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static org.json.JSONObject d(java.lang.String str) {
        java.lang.String str2 = "";
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        org.json.JSONObject jSONObject = null;
        try {
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(b(f17), null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                jSONObject = c(str3).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).optJSONObject(str);
                str2 = "Config Storage";
            }
        } catch (java.lang.Exception unused) {
        }
        if (jSONObject == null) {
            try {
                java.lang.String a17 = a();
                if (a17 != null) {
                    jSONObject = new org.json.JSONObject(a17).optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).optJSONObject(str);
                    str2 = com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0.TAG;
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfigKeyObj %s %s %s", f17, str, str2);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r6) {
        /*
            java.lang.String r0 = ""
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(r1)
            r2 = 0
            gm0.b0 r3 = gm0.j1.u()     // Catch: java.lang.Exception -> L28
            com.tencent.mm.storage.n3 r3 = r3.c()     // Catch: java.lang.Exception -> L28
            com.tencent.mm.storage.u3 r4 = b(r1)     // Catch: java.lang.Exception -> L28
            java.lang.Object r3 = r3.m(r4, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L28
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)     // Catch: java.lang.Exception -> L28
            if (r4 != 0) goto L28
            org.json.JSONObject r2 = c(r3)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "Config Storage"
            goto L29
        L28:
            r3 = r0
        L29:
            if (r2 != 0) goto L3a
            java.lang.String r4 = a()     // Catch: java.lang.Exception -> L3a
            if (r4 == 0) goto L3a
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3a
            r5.<init>(r4)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "Asset"
            r3 = r2
        L39:
            r2 = r5
        L3a:
            if (r2 != 0) goto L41
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L41:
            java.lang.String r4 = "getWebSearchConfigMetaKeyObj %s %s %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r6, r3}
            java.lang.String r3 = "MicroMsg.WebSearch.WebSearchConfigLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r1)
            java.lang.Object r6 = r2.opt(r6)
            if (r6 != 0) goto L53
            goto L57
        L53:
            java.lang.String r0 = r6.toString()
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su4.o2.e(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(java.util.List r10, int r11, long r12, java.util.List r14, boolean r15) {
        /*
            java.util.HashMap r0 = su4.o2.f494564d
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            su4.o2.f494564d = r0
        Lb:
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(r0)
            java.lang.String r1 = "MicroMsg.WebSearch.WebSearchConfigLogic"
            r2 = 0
            if (r15 != 0) goto La9
            java.lang.String r3 = su4.o2.f494565e
            if (r3 == 0) goto L22
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L22
            goto La9
        L22:
            java.util.HashMap r15 = su4.o2.f494564d
            java.lang.Object r15 = r15.get(r0)
            java.lang.Long r15 = (java.lang.Long) r15
            if (r15 != 0) goto L32
            r3 = 0
            java.lang.Long r15 = java.lang.Long.valueOf(r3)
        L32:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r15.longValue()
            long r3 = r3 - r5
            r5 = 600000(0x927c0, double:2.964394E-318)
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 0
            if (r15 >= 0) goto L44
            return r3
        L44:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r15 = java.lang.Long.valueOf(r4)
            java.util.HashMap r4 = su4.o2.f494564d
            r4.put(r0, r15)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            java.lang.Object[] r15 = new java.lang.Object[]{r0, r15, r4}
            java.lang.String r4 = "startToRequestConfig %s %d %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4, r15)
            gm0.b0 r15 = gm0.j1.u()
            com.tencent.mm.storage.n3 r15 = r15.c()
            com.tencent.mm.storage.u3 r1 = b(r0)
            java.lang.Object r15 = r15.m(r1, r2)
            java.lang.String r15 = (java.lang.String) r15
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r15)     // Catch: java.lang.Exception -> L80
            if (r1 != 0) goto L80
            org.json.JSONObject r15 = c(r15)     // Catch: java.lang.Exception -> L80
            goto L81
        L80:
            r15 = r2
        L81:
            su4.n2 r1 = su4.n2.Valid
            if (r15 != 0) goto L88
            su4.n2 r15 = su4.n2.Invalid
            goto La6
        L88:
            java.lang.String r4 = "updateTime"
            long r4 = r15.optLong(r4)
            java.lang.String r6 = "timevalSec"
            long r6 = r15.optLong(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r4 = r4 + r6
            long r6 = java.lang.System.currentTimeMillis()
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 >= 0) goto La5
            su4.n2 r15 = su4.n2.Expired
            goto La6
        La5:
            r15 = r1
        La6:
            if (r15 != r1) goto Lc0
            return r3
        La9:
            java.lang.String r3 = su4.o2.f494565e
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            java.lang.Object[] r15 = new java.lang.Object[]{r3, r0, r15, r4, r5}
            java.lang.String r3 = "force update cfg %s %s %s, scene: %d, businness: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r15)
        Lc0:
            su4.o2.f494565e = r0
            su4.y1 r15 = su4.o2.f494563c
            if (r15 == 0) goto Ld1
            com.tencent.mm.modelbase.r1 r15 = gm0.j1.d()
            su4.y1 r0 = su4.o2.f494563c
            r15.d(r0)
            su4.o2.f494563c = r2
        Ld1:
            su4.y1 r15 = new su4.y1
            r3 = r15
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r3.<init>(r4, r5, r6, r8)
            su4.o2.f494563c = r15
            com.tencent.mm.modelbase.r1 r10 = gm0.j1.d()
            com.tencent.mm.modelbase.u0 r11 = su4.o2.f494566f
            r12 = 1948(0x79c, float:2.73E-42)
            r10.a(r12, r11)
            com.tencent.mm.modelbase.r1 r10 = gm0.j1.d()
            su4.y1 r11 = su4.o2.f494563c
            r10.g(r11)
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: su4.o2.f(java.util.List, int, long, java.util.List, boolean):boolean");
    }
}
