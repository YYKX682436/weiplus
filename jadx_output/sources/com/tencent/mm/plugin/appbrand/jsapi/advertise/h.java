package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.o f78748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f78749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f78750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78753i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, int i17) {
        super(1);
        this.f78748d = oVar;
        this.f78749e = lVar;
        this.f78750f = jSONObject;
        this.f78751g = str;
        this.f78752h = str2;
        this.f78753i = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.Object m521constructorimpl;
        java.lang.String a17;
        java.lang.String implSource = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(implSource, "implSource");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] originImpl impl:" + implSource + ", strategy:" + this.f78748d.E());
        com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar = this.f78748d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78749e;
        org.json.JSONObject jSONObject = this.f78750f;
        com.tencent.mm.plugin.appbrand.jsapi.advertise.g gVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.g(implSource, this.f78751g, this.f78752h, lVar, this.f78753i, oVar, jSONObject);
        oVar.getClass();
        java.lang.String optString = jSONObject.optString("envVersion");
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b bVar = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE;
        int i17 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(optString, bVar).f82194d;
        s40.r0 r0Var = (s40.r0) i95.n0.c(s40.r0.class);
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        boolean Ai = ((com.tencent.mm.feature.finder.live.m1) r0Var).Ai(jSONObject, i17, appId);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (Ai) {
            gVar.invoke(java.lang.Boolean.TRUE, "", java.lang.Boolean.FALSE);
            return f0Var;
        }
        boolean b17 = kotlin.jvm.internal.o.b(jSONObject.optString("mode"), "halfPage");
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = jSONObject.optString("appId");
        b1Var.f317012a = jSONObject.optString("userName");
        b1Var.f317022f = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        b1Var.f317032k = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String appId2 = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
        java.lang.String appId3 = b1Var.f317014b;
        kotlin.jvm.internal.o.f(appId3, "appId");
        java.lang.String optString2 = jSONObject.optString("sceneNote");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        if (kotlin.jvm.internal.o.b(appId2, "MagicAdMiniProgram")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(appId3);
            sb6.append(':');
            java.lang.String[] strArr = new java.lang.String[5];
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                a17 = gm0.j1.b().j();
                kotlin.jvm.internal.o.d(a17);
            } else {
                a17 = kk.v.a(gm0.m.i());
                kotlin.jvm.internal.o.d(a17);
            }
            java.lang.String str2 = a17;
            str = "[MBAd] keepAlive check: bizName=";
            strArr[0] = "hash=".concat(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ts=");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            cls = s40.r0.class;
            sb7.append(java.lang.System.currentTimeMillis());
            strArr[1] = sb7.toString();
            strArr[2] = "host=";
            strArr[3] = "version=" + o45.wf.f343029g;
            strArr[4] = "device=2";
            sb6.append(u46.l.k(strArr, "&"));
            sb6.append("::");
            sb6.append(optString2);
            optString2 = sb6.toString();
        } else {
            str = "[MBAd] keepAlive check: bizName=";
            cls = s40.r0.class;
        }
        b1Var.f317034l = optString2;
        b1Var.f317016c = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(jSONObject.optString("envVersion"), bVar).f82194d;
        b1Var.f317035m = jSONObject.optInt("preScene", 0);
        b1Var.f317036n = jSONObject.optString("preSceneNote");
        b1Var.f317029i0 = jSONObject.optString("adInfo");
        if (jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA) || jSONObject.has("privateExtraData")) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
            appBrandLaunchReferrer.f77323e = lVar.getAppId();
            appBrandLaunchReferrer.f77324f = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, "{}");
            appBrandLaunchReferrer.f77325g = jSONObject.optString("privateExtraData", "{}");
            appBrandLaunchReferrer.f77322d = 1;
            b1Var.f317041s = appBrandLaunchReferrer;
        }
        if (jSONObject.has("devuin")) {
            b1Var.f317020e = kk.v.b(jSONObject.optString("devuin"));
        }
        if (jSONObject.has("adUxInfo")) {
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putString("adUxInfo", jSONObject.optString("adUxInfo"));
            b1Var.f317030j = persistableBundle;
        }
        if (b17) {
            b1Var.G = oVar.C(jSONObject);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "launch: appId:" + b1Var.f317014b + ", enterPath: " + b1Var.f317022f + ", scene: " + b1Var.f317032k + ", sceneNote:" + b1Var.f317034l + ", version: " + b1Var.f317018d + ", prescene: " + b1Var.f317035m + ", presceneNote:" + b1Var.f317036n + ", halfScreenConfig: " + b1Var.G);
        android.content.Context f147807d = lVar.getF147807d();
        if (f147807d.getResources().getConfiguration().orientation != 1 && !b17) {
            ((com.tencent.mm.feature.finder.live.m1) ((s40.r0) i95.n0.c(cls))).wi();
        }
        com.tencent.mm.plugin.appbrand.jsapi.advertise.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.advertise.k(f147807d, b1Var, gVar);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (kotlin.jvm.internal.o.b(lVar.getAppId(), "MagicAdMiniProgram")) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
                sb8.append(lVar.getAppId());
                sb8.append(", expt_enabled=");
                jz5.g gVar2 = oVar.f78769h;
                sb8.append(((java.lang.Boolean) ((jz5.n) gVar2).getValue()).booleanValue());
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", sb8.toString());
                if (((java.lang.Boolean) ((jz5.n) gVar2).getValue()).booleanValue()) {
                    ((com.tencent.mm.magicbrush.plugin.scl.jsapi.k) ((com.tencent.mm.magicbrush.plugin.scl.jsapi.i) i95.n0.c(com.tencent.mm.magicbrush.plugin.scl.jsapi.i.class))).wi(lVar, new com.tencent.mm.plugin.appbrand.jsapi.advertise.j(kVar));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive skipped, reason=expt_disabled");
                    kVar.invoke(java.lang.Boolean.FALSE);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive skipped, reason=not_magic_ad");
                kVar.invoke(java.lang.Boolean.FALSE);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return f0Var;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive block exception, reason=exception: " + m524exceptionOrNullimpl);
        kVar.invoke(java.lang.Boolean.FALSE);
        return f0Var;
    }
}
