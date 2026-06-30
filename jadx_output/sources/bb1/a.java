package bb1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f18767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bb1.b f18769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18770g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18771h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f18772i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f18773m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f18774n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f18775o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18776p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f18777q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f18778r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f18779s;

    public a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, bb1.b bVar, java.lang.String str, int i18, com.tencent.mm.vfs.r6 r6Var, boolean z17, boolean z18, boolean z19, int i19, java.util.HashMap hashMap, java.util.HashMap hashMap2, boolean z27) {
        this.f18767d = lVar;
        this.f18768e = i17;
        this.f18769f = bVar;
        this.f18770g = str;
        this.f18771h = i18;
        this.f18772i = r6Var;
        this.f18773m = z17;
        this.f18774n = z18;
        this.f18775o = z19;
        this.f18776p = i19;
        this.f18777q = hashMap;
        this.f18778r = hashMap2;
        this.f18779s = z27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17;
        long j17 = 1000;
        int nanoTime = (int) (java.lang.System.nanoTime() / j17);
        try {
            com.tencent.mm.vfs.r6 r6Var = this.f18772i;
            java.lang.String str2 = this.f18770g;
            boolean z17 = this.f18773m;
            boolean z18 = this.f18774n;
            boolean z19 = this.f18775o;
            int i18 = this.f18776p;
            java.util.HashMap hashMap = this.f18777q;
            java.util.HashMap hashMap2 = this.f18778r;
            boolean z27 = this.f18779s;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.wexnet.WeXNet.Companion companion = com.tencent.mm.wexnet.WeXNet.INSTANCE;
            java.lang.String u17 = r6Var.u();
            kotlin.jvm.internal.o.f(u17, "getPath(...)");
            com.tencent.mm.wexnet.Options options = new com.tencent.mm.wexnet.Options(1, str2, z17, z18, z19, i18, hashMap, hashMap2, z27, com.tencent.mm.wexnet.v.f214379a.c());
            companion.getClass();
            companion.a();
            com.tencent.mm.wexnet.SessionCreateResult createSession = com.tencent.mm.wexnet.WeXNet.createSession(u17, options);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateInferenceSession", "tryCreateSession cost[" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ']');
            this.f18769f.C(this.f18770g);
            x71.m mVar = (x71.m) i95.n0.c(x71.m.class);
            if (mVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCreateInferenceSession", "AppBrandXNetSessionMgr is null");
                com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f18767d;
                int i19 = this.f18768e;
                bb1.b bVar = this.f18769f;
                bVar.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i19, bVar.u(str, jSONObject));
                return;
            }
            java.lang.String appId = this.f18767d.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            com.tencent.mm.wexnet.SessionKeeper sessionPtr = createSession.getSessionKeeper();
            j81.a aVar = (j81.a) mVar;
            synchronized (aVar) {
                kotlin.jvm.internal.o.g(sessionPtr, "sessionPtr");
                i17 = aVar.f298138d;
                aVar.f298138d = i17 + 1;
                aVar.f298139e.put(java.lang.Integer.valueOf(i17), sessionPtr);
                aVar.f298140f.put(java.lang.Integer.valueOf(i17), appId);
            }
            int i27 = 0;
            if (createSession.getSuccess()) {
                com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f18767d;
                int i28 = this.f18768e;
                bb1.b bVar2 = this.f18769f;
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "" + i17);
                bVar2.getClass();
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                hashMap3.put("errno", 0);
                lVar2.a(i28, bVar2.t("ok", hashMap3));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateInferenceSession", "createInferenceSession invoke cost[" + ((((int) (java.lang.System.nanoTime() / j17)) - nanoTime) + this.f18771h) + ']');
                return;
            }
            java.lang.String str5 = "";
            long[] codes = createSession.getCodes();
            int length = codes.length;
            int i29 = 0;
            while (i27 < length) {
                long j18 = codes[i27];
                int i37 = i29 + 1;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str5);
                sb6.append(j18);
                sb6.append(':');
                sb6.append(createSession.getDesc().length > i29 ? createSession.getDesc()[i29] : "");
                sb6.append('\n');
                str5 = sb6.toString();
                i27++;
                i29 = i37;
            }
            com.tencent.mm.plugin.appbrand.jsapi.l lVar3 = this.f18767d;
            int i38 = this.f18768e;
            bb1.b bVar3 = this.f18769f;
            java.lang.String format = java.lang.String.format("fail:create session fail : %s", java.util.Arrays.copyOf(new java.lang.Object[]{str5}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            bVar3.getClass();
            str = android.text.TextUtils.isEmpty(null) ? format : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 2004001);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar3.a(i38, bVar3.u(str, jSONObject2));
        } catch (com.tencent.mm.wexnet.w unused) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar4 = this.f18767d;
            int i39 = this.f18768e;
            bb1.b bVar4 = this.f18769f;
            bVar4.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:environment not ready" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 2004010);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar4.a(i39, bVar4.u(str, jSONObject3));
        }
    }
}
