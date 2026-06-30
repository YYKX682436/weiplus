package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "openLiteApp";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.e9 f81558h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81557g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f81559i = false;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("invalid_data"));
            return;
        }
        this.f81558h = e9Var;
        q80.d0 d0Var = new q80.d0();
        try {
            if (!jSONObject.has("appId")) {
                e9Var.a(i17, o("invalid_appId"));
                return;
            }
            java.lang.String string = jSONObject.getString("appId");
            d0Var.f360649a = string;
            boolean z17 = jSONObject.has("checkUpdate") ? jSONObject.getBoolean("checkUpdate") : true;
            boolean z18 = jSONObject.has("syncCheckUpdate") ? jSONObject.getBoolean("syncCheckUpdate") : false;
            boolean z19 = jSONObject.has("openDataChannel") ? jSONObject.getBoolean("openDataChannel") : false;
            if (jSONObject.has("query")) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query");
                d0Var.f360651c = optJSONObject != null ? optJSONObject.toString() : jSONObject.optString("query", "");
            }
            if (jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE)) {
                str = jSONObject.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                d0Var.f360650b = str;
            } else {
                str = "";
            }
            if (jSONObject.has("isTransparent") && jSONObject.getBoolean("isTransparent")) {
                d0Var.f360652d = java.lang.Boolean.TRUE;
            }
            if (jSONObject.has("isForbidRightGesture") && jSONObject.getBoolean("isForbidRightGesture")) {
                d0Var.f360653e = true;
            }
            if (jSONObject.has("isHalfScreen") && jSONObject.getBoolean("isHalfScreen")) {
                d0Var.f360657i = 1;
            }
            if (jSONObject.has("forcePortrait")) {
                this.f81559i = jSONObject.getBoolean("forcePortrait");
            }
            if (jSONObject.has("heightPercent")) {
                d0Var.f360658j = jSONObject.getDouble("heightPercent");
            }
            java.lang.String string2 = jSONObject.has("minVersion") ? jSONObject.getString("minVersion") : "";
            if (jSONObject.has("enableDragToCloseInHalfScreen")) {
                boolean z27 = jSONObject.getBoolean("enableDragToCloseInHalfScreen");
                if (d0Var.f360657i == 1) {
                    d0Var.f360659k = z27;
                }
            }
            if (jSONObject.has("enableDragToFullScreenInHalfScreen")) {
                boolean z28 = jSONObject.getBoolean("enableDragToFullScreenInHalfScreen");
                if (d0Var.f360657i == 1) {
                    d0Var.f360660l = z28;
                }
            }
            if (jSONObject.has("enterType")) {
                java.lang.String string3 = jSONObject.getString("enterType");
                if (string3.equals("modal")) {
                    d0Var.f360664p = com.tencent.mm.R.anim.f477876e0;
                    d0Var.f360665q = com.tencent.mm.R.anim.f477877e1;
                } else if (string3.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                    d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
                    d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
                }
            } else {
                d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
                d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
            }
            if (jSONObject.has("isRedirect")) {
                this.f81557g = jSONObject.getBoolean("isRedirect");
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("keepAlive");
            if (optJSONObject2 != null) {
                d0Var.A = optJSONObject2.optInt("seconds", 0);
            }
            if (jSONObject.has("ignoreAlive")) {
                d0Var.B = jSONObject.optBoolean("ignoreAlive");
            }
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WA_APP;
            liteAppReferrerInfo.sceneId = e9Var.getAppId();
            d0Var.f360674z = liteAppReferrerInfo;
            java.lang.String string4 = jSONObject.has("preInjectData") ? jSONObject.getString("preInjectData") : "";
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(20980, new java.lang.Object[0]);
            fVar.w(1293L, 89L, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "open liteapp:" + string + ", page:" + str);
            d0Var.f360666r = false;
            d0Var.f360667s = false;
            java.lang.Object[] objArr = {null, java.lang.Boolean.FALSE};
            android.content.Context f147807d = e9Var.getF147807d();
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.appbrand.jsapi.liteapp.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.k(this, objArr, f147807d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(kVar, 500L, false);
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.JsApiOpenLiteApp$OpenLiteAppData(string, string2, string4, e9Var.getAppId(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19)), com.tencent.mm.plugin.appbrand.jsapi.liteapp.s.class, new com.tencent.mm.plugin.appbrand.jsapi.liteapp.m(this, objArr, e9Var, i17, d0Var, f147807d));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenLiteApp", e17, "", new java.lang.Object[0]);
            e9Var.a(i17, o("fail"));
        }
    }
}
