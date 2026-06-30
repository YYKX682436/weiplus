package sg0;

@j95.b
/* loaded from: classes8.dex */
public final class a2 extends i95.w implements su4.z0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f489199d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f489200e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f489201f = true;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f489202g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f489203h = true;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f489204i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final sg0.y1 f489205m = new sg0.y1(this);

    /* renamed from: n, reason: collision with root package name */
    public final sg0.z1 f489206n = new sg0.z1(this, android.os.Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public final sg0.n1 f489207o = new sg0.n1(this);

    public final void Ai() {
        if (Ri()) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f489202g)) {
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(this.f489202g)) {
                    return;
                }
            }
            uv4.g g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(0);
            if (g17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "checkCreateStore fail, getSearchTemplate fail");
                return;
            }
            java.lang.String l17 = g17.l();
            com.p314xaae8f345.mm.vfs.r6 p17 = ((uv4.b) g17).p();
            java.util.Properties properties = new java.util.Properties();
            if (p17.A()) {
                try {
                    java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(p17);
                    try {
                        properties.load(C);
                        vz5.b.a(C, null);
                    } finally {
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.BaseWebSearchTemplate", e17, "", new java.lang.Object[0]);
                }
            }
            if ((l17.length() == 0) || properties.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "checkCreateStore fail, fTSTemplatePath or templateConfigValues isEmpty");
                return;
            }
            java.lang.Object obj = properties.get("liteappStoreAppid");
            java.lang.Object obj2 = properties.get("liteappStorePath");
            if (!(obj == null)) {
                if (!(obj2 == null)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str = (java.lang.String) obj;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String concat = l17.concat((java.lang.String) obj2);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).pj(str, -1, concat);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Di(this.f489205m);
                    this.f489202g = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "checkCreateStore, liteappStoreFullPath: " + concat + ", currLiteAppId: " + str);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "checkCreateStore fail, liteappStoreAppidVal or liteappStorePathVal isNull");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|(1:5)(1:43)|(12:7|8|9|10|(1:12)(1:38)|(2:14|15)|(1:37)(1:20)|21|(2:(1:26)|(2:28|(3:30|31|32)(2:34|35)))|36|31|32)|42|8|9|10|(0)(0)|(0)|(1:18)|37|21|(0)|36|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0044, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0045, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #1 {Exception -> 0x0044, blocks: (B:10:0x0033, B:14:0x003e), top: B:9:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bi(org.json.JSONObject r11, yz5.l r12) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = "parmas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r2)
            java.lang.String r2 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "requestId"
            r4 = 0
            r5 = 1
            r6 = 0
            boolean r7 = r11.has(r3)     // Catch: java.lang.Exception -> L28
            if (r7 != r5) goto L20
            r7 = r5
            goto L21
        L20:
            r7 = r4
        L21:
            if (r7 == 0) goto L30
            java.lang.String r7 = r11.getString(r3)     // Catch: java.lang.Exception -> L28
            goto L31
        L28:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r7)
        L30:
            r7 = r6
        L31:
            java.lang.String r8 = "appId"
            boolean r9 = r11.has(r8)     // Catch: java.lang.Exception -> L44
            if (r9 != r5) goto L3b
            r9 = r5
            goto L3c
        L3b:
            r9 = r4
        L3c:
            if (r9 == 0) goto L4c
            java.lang.String r11 = r11.getString(r8)     // Catch: java.lang.Exception -> L44
            r6 = r11
            goto L4c
        L44:
            r11 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r11)
        L4c:
            if (r7 == 0) goto L57
            int r11 = r7.length()
            if (r11 != 0) goto L55
            goto L57
        L55:
            r11 = r4
            goto L58
        L57:
            r11 = r5
        L58:
            java.lang.String r0 = "err_msg"
            java.lang.String r1 = "err_code"
            java.lang.String r8 = "MicroMsg.WebSearch.ServiceWorkerFeatureService"
            if (r11 != 0) goto L92
            if (r6 == 0) goto L6a
            int r11 = r6.length()
            if (r11 != 0) goto L69
            goto L6a
        L69:
            r5 = r4
        L6a:
            if (r5 == 0) goto L6d
            goto L92
        L6d:
            r2.put(r3, r7)
            java.lang.Class<q80.g0> r11 = q80.g0.class
            i95.m r11 = i95.n0.c(r11)
            q80.g0 r11 = (q80.g0) r11
            com.tencent.mm.feature.lite.i r11 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r11
            boolean r11 = r11.tk(r6)
            if (r11 != 0) goto L86
            java.lang.String r11 = "checkLiteAppStoreAlive fail, storeIsAlive"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r11)
            goto L97
        L86:
            r2.put(r1, r4)
            java.lang.String r11 = "checkLiteAppStoreAlive:ok"
            r2.put(r0, r11)
            r12.mo146xb9724478(r2)
            return
        L92:
            java.lang.String r11 = "checkLiteAppStoreAlive fail, appId unset"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r11)
        L97:
            r11 = -1
            r2.put(r1, r11)
            java.lang.String r11 = "checkLiteAppStoreAlive:fail"
            r2.put(r0, r11)
            r12.mo146xb9724478(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.Bi(org.json.JSONObject, yz5.l):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:49|(3:140|141|(20:143|(1:53)(1:139)|54|55|56|57|(1:59)(1:127)|(12:61|62|63|64|65|(1:67)(5:101|(6:103|(4:115|116|117|(4:119|(3:110|111|109)|108|109))(1:105)|106|(0)|108|109)|75|76|77)|(5:72|(1:74)(3:79|80|(4:90|91|92|93)(5:82|83|84|85|86))|75|76|77)|100|(0)(0)|75|76|77)|126|62|63|64|65|(0)(0)|(6:69|72|(0)(0)|75|76|77)|100|(0)(0)|75|76|77))|51|(0)(0)|54|55|56|57|(0)(0)|(0)|126|62|63|64|65|(0)(0)|(0)|100|(0)(0)|75|76|77) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x019d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019e, code lost:
    
        r4 = r19;
        r1 = "MicroMsg.WebSearch.ServiceWorkerFeatureService";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0102, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01a3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a4, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a A[Catch: Exception -> 0x019d, TryCatch #7 {Exception -> 0x019d, blocks: (B:65:0x0112, B:69:0x0147, B:79:0x0154, B:101:0x011a, B:114:0x013c), top: B:64:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[Catch: Exception -> 0x00d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d8, blocks: (B:141:0x00d0, B:53:0x00dd), top: B:140:0x00d0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc A[Catch: Exception -> 0x0101, TRY_LEAVE, TryCatch #13 {Exception -> 0x0101, blocks: (B:57:0x00f0, B:61:0x00fc), top: B:56:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147 A[Catch: Exception -> 0x019d, TryCatch #7 {Exception -> 0x019d, blocks: (B:65:0x0112, B:69:0x0147, B:79:0x0154, B:101:0x011a, B:114:0x013c), top: B:64:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154 A[Catch: Exception -> 0x019d, TRY_LEAVE, TryCatch #7 {Exception -> 0x019d, blocks: (B:65:0x0112, B:69:0x0147, B:79:0x0154, B:101:0x011a, B:114:0x013c), top: B:64:0x0112 }] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(org.json.JSONObject r18, yz5.l r19) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.Di(org.json.JSONObject, yz5.l):void");
    }

    public boolean Ni() {
        boolean l17 = j62.e.g().l("clicfg_android_finder_search_preload_by_expose", false, true, true);
        if (this.f489200e != l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "enableFinderSearchPreloadByExpose: " + this.f489200e + " -> " + l17);
            this.f489200e = l17;
        }
        return this.f489200e;
    }

    public boolean Ri() {
        boolean l17 = j62.e.g().l("clicfg_android_search_use_service_worker", false, true, true);
        if (this.f489199d != l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "enableServiceWorker: " + this.f489199d + " -> " + l17);
            this.f489199d = l17;
        }
        return this.f489199d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r8 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ui(org.json.JSONObject r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.Ui(org.json.JSONObject, yz5.l):void");
    }

    public void Vi(java.lang.String tabName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tabName", tabName);
            ij("app.tabSwitch", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifyBottomTabSwitch exp:" + e17);
        }
    }

    public final void Zi(boolean z17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("state", z17 ? "paused" : "resumed");
            ij("app.lifecycleStateChange", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifyLifecycleStateChange exp:" + e17);
        }
    }

    public void aj(int i17, int i18) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            jSONObject.put("type", i18);
            ij("search.searchEntryClick", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifySearchEntryClick exp:" + e17);
        }
    }

    public void bj(int i17, int i18, org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        try {
            extParams.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            extParams.put("type", i18);
            ij("search.searchEntryClick", extParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifySearchEntryClick exp:" + e17);
        }
    }

    public void cj(int i17, int i18) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            jSONObject.put("type", i18);
            ij("search.searchEntryExpose", jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifySearchEntryExpose exp:" + e17);
        }
    }

    public void fj(int i17, int i18, org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        try {
            extParams.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            extParams.put("type", i18);
            ij("search.searchEntryExpose", extParams);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifySearchEntryExpose exp:" + e17);
        }
    }

    public void hj(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new org.json.JSONObject();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.ServiceWorkerFeatureService", "notifySearchQuit exp:" + e17);
                return;
            }
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        ij("search.searchQuit", jSONObject);
    }

    public final void ij(java.lang.String str, org.json.JSONObject jSONObject) {
        if (Ri()) {
            oj(1);
            Ai();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l(str, jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "publishGlobalEventToAll, " + str + ", " + jSONObject);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(1:5)(1:39)|(11:7|8|9|10|(1:12)(1:34)|(2:14|15)|(1:33)(1:20)|21|(2:(1:26)|(2:28|29))|31|32)|38|8|9|10|(0)(0)|(0)|(1:18)|33|21|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #1 {Exception -> 0x0044, blocks: (B:10:0x0033, B:14:0x003e), top: B:9:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mj(org.json.JSONObject r11, yz5.l r12) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = "parmas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r2)
            java.lang.String r2 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "requestId"
            r4 = 0
            r5 = 1
            r6 = 0
            boolean r7 = r11.has(r3)     // Catch: java.lang.Exception -> L28
            if (r7 != r5) goto L20
            r7 = r5
            goto L21
        L20:
            r7 = r4
        L21:
            if (r7 == 0) goto L30
            java.lang.String r7 = r11.getString(r3)     // Catch: java.lang.Exception -> L28
            goto L31
        L28:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r7)
        L30:
            r7 = r6
        L31:
            java.lang.String r8 = "appId"
            boolean r9 = r11.has(r8)     // Catch: java.lang.Exception -> L44
            if (r9 != r5) goto L3b
            r9 = r5
            goto L3c
        L3b:
            r9 = r4
        L3c:
            if (r9 == 0) goto L4c
            java.lang.String r11 = r11.getString(r8)     // Catch: java.lang.Exception -> L44
            r6 = r11
            goto L4c
        L44:
            r11 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r11)
        L4c:
            if (r7 == 0) goto L57
            int r11 = r7.length()
            if (r11 != 0) goto L55
            goto L57
        L55:
            r11 = r4
            goto L58
        L57:
            r11 = r5
        L58:
            java.lang.String r0 = "err_msg"
            java.lang.String r1 = "err_code"
            if (r11 != 0) goto L87
            if (r6 == 0) goto L68
            int r11 = r6.length()
            if (r11 != 0) goto L67
            goto L68
        L67:
            r5 = r4
        L68:
            if (r5 == 0) goto L6b
            goto L87
        L6b:
            java.lang.Class<q80.g0> r11 = q80.g0.class
            i95.m r11 = i95.n0.c(r11)
            q80.g0 r11 = (q80.g0) r11
            com.tencent.mm.feature.lite.i r11 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r11
            r11.Zj(r6)
            r2.put(r3, r7)
            r2.put(r1, r4)
            java.lang.String r11 = "releaseLiteAppStore:ok"
            r2.put(r0, r11)
            r12.mo146xb9724478(r2)
            return
        L87:
            java.lang.String r11 = "MicroMsg.WebSearch.ServiceWorkerFeatureService"
            java.lang.String r3 = "releaseLiteAppStore fail, appId unset"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r11, r3)
            r11 = -1
            r2.put(r1, r11)
            java.lang.String r11 = "releaseLiteAppStore:fail"
            r2.put(r0, r11)
            r12.mo146xb9724478(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.mj(org.json.JSONObject, yz5.l):void");
    }

    public final void nj() {
        java.lang.String str = this.f489202g;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "releaseStore, isNullOrEmpty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "releaseStore, currLiteAppId: " + this.f489202g);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(this.f489205m);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(this.f489202g);
        this.f489202g = "";
    }

    public final void oj(int i17) {
        sg0.z1 z1Var = this.f489206n;
        if (i17 == 1 && z1Var.hasMessages(1)) {
            z1Var.removeMessages(1);
            this.f489203h = false;
            Zi(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "removeDelayMessageIfNeeded, give delay create store!");
        }
        if (i17 == 101 && z1Var.hasMessages(101)) {
            z1Var.removeMessages(101);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "removeDelayMessageIfNeeded, give up release store!");
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAccountInitialized, enableServiceWorker: " + Ri());
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f489207o);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onAccountInitialized, onAccountReleased: " + Ri());
        nj();
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f489207o);
        super.mo836xb8969aab(context);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "onCreate");
        super.mo8845x3e5a77bb(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #3 {Exception -> 0x0093, blocks: (B:79:0x008b, B:30:0x0098), top: B:78:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b4, blocks: (B:70:0x00ac, B:36:0x00b9), top: B:69:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pj(org.json.JSONObject r17, yz5.l r18, java.lang.ref.WeakReference r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.pj(org.json.JSONObject, yz5.l, java.lang.ref.WeakReference):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(3:2|3|(1:5)(1:89))|(14:7|8|9|10|(1:12)(1:84)|(7:14|(1:81)(1:18)|19|(2:(1:22)(1:79)|(15:24|(3:75|76|(13:78|(11:28|29|(3:66|67|(7:69|(2:33|34)|(1:65)(1:42)|(2:(1:47)|(4:49|(1:51)(5:55|(1:57)|58|59|(1:61)(2:62|63))|52|53))|64|52|53))|31|(0)|(1:40)|65|(0)|64|52|53)|74|29|(0)|31|(0)|(0)|65|(0)|64|52|53))|26|(0)|74|29|(0)|31|(0)|(0)|65|(0)|64|52|53))|80|52|53)|83|(1:16)|81|19|(0)|80|52|53)|88|8|9|10|(0)(0)|(0)|83|(0)|81|19|(0)|80|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0050, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:10:0x003f, B:14:0x004a), top: B:9:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #2 {Exception -> 0x0087, blocks: (B:76:0x007f, B:28:0x008c), top: B:75:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a5, blocks: (B:67:0x009d, B:33:0x00aa), top: B:66:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qj(org.json.JSONObject r13, yz5.l r14, java.lang.ref.WeakReference r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.a2.qj(org.json.JSONObject, yz5.l, java.lang.ref.WeakReference):void");
    }

    public void wi(org.json.JSONObject parmas, java.lang.ref.WeakReference webView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parmas, "parmas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        yz5.l p1Var = new sg0.p1(webView);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = true;
        java.lang.String str = null;
        try {
            try {
                if (parmas.has(ya.b.f77491x8758c4e1)) {
                    str = parmas.getString(ya.b.f77491x8758c4e1);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            if (str != null && str.length() != 0) {
                z17 = false;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiFeatureFeatureService", e18, "callLiteAppConnectEvent exception", new java.lang.Object[0]);
        }
        if (str.equals("subscribeLiteAppStore")) {
            pj(parmas, p1Var, webView);
            return;
        }
        if (str.equals("unsubscribeLiteAppStore")) {
            qj(parmas, p1Var, webView);
            return;
        }
        if (str.equals("ensureLiteAppStoreAlive")) {
            Ui(parmas, p1Var);
            return;
        }
        if (str.equals("checkLiteAppStoreAlive")) {
            Bi(parmas, p1Var);
            return;
        }
        if (str.equals("releaseLiteAppStore")) {
            mj(parmas, p1Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.WebSearchJSApiFeatureFeatureService", "callLiteAppConnectEvent, method unset");
        jSONObject.put("err_code", -1);
        jSONObject.put("err_msg", "callLiteAppConnectEvent:fail");
        p1Var.mo146xb9724478(jSONObject);
    }
}
