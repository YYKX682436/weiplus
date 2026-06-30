package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a {
    public static final int CTRL_INDEX = 592;
    public static final java.lang.String NAME = "openBusinessView";

    /* renamed from: g, reason: collision with root package name */
    public boolean f80954g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f80955h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f80956i;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        final java.lang.String optString = jSONObject.optString("businessType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            D(yVar, i17, -4, "fail invalid businessType");
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = optJSONObject;
        if (jSONObject.optJSONObject("privateExtraData") == null) {
            new org.json.JSONObject();
        }
        java.lang.String optString2 = jSONObject.optString("queryString");
        int i18 = yVar.t3().E0().f305852r.f75399d;
        int i19 = (i18 == 1 || i18 == 2) ? com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(jSONObject.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE).f82194d : 0;
        int optInt = jSONObject.optInt("sourcetype", 5);
        java.lang.String optString3 = jSONObject.optString("agentId");
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d();
        dVar.f82204a = i17;
        dVar.f82205b = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        dVar.f82206c = jSONObject.optString("sceneNote");
        dVar.f82207d = jSONObject.optInt("preScene", 0);
        dVar.f82208e = jSONObject.optString("preSceneNote");
        dVar.f82210g = optInt;
        dVar.f82209f = optString3;
        dVar.f82212i = optString;
        dVar.f82214k = jSONObject.optBoolean("sticky", false);
        dVar.f82215l = jSONObject.optBoolean("disableVisibilityEvent", false);
        java.lang.String appId = yVar.getAppId();
        this.f80954g = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.l(this, yVar.getContext(), new com.tencent.mm.plugin.appbrand.jsapi.fakenative.i(this, yVar, i17)));
        com.tencent.mm.sdk.event.IListener iListener = this.f80956i;
        if (iListener != null) {
            iListener.dead();
        }
        final androidx.lifecycle.y lifecycleOwner = yVar.getLifecycleOwner();
        java.util.Objects.requireNonNull(lifecycleOwner);
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent> iListener2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.JsApiOpenBusinessView$3
            {
                this.__eventId = -1201570635;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent navigateBackMiniProgramEvent) {
                org.json.JSONObject jSONObject3;
                com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent navigateBackMiniProgramEvent2 = navigateBackMiniProgramEvent;
                if (!u46.l.c(navigateBackMiniProgramEvent2.f54516g.f7430b, optString)) {
                    return false;
                }
                am.nk nkVar = navigateBackMiniProgramEvent2.f54516g;
                java.lang.String str = nkVar.f7432d;
                com.tencent.mm.plugin.appbrand.y yVar2 = yVar;
                if (!u46.l.c(str, yVar2.getAppId())) {
                    return false;
                }
                int i27 = nkVar.f7429a;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.this;
                int i28 = i17;
                if (i27 < 0) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("errCode", java.lang.Integer.valueOf(i27));
                    java.lang.String str2 = i27 == -2 ? "fail CGI error" : i27 == -3 ? "fail cancel" : i27 == -4 ? "fail invalid businessType" : "fail system error";
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram fail, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i27), str2);
                    yVar2.a(i28, hVar.p(str2, hashMap));
                } else {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("errCode", java.lang.Integer.valueOf(i27));
                    java.lang.String str3 = nkVar.f7431c;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str3 == null) {
                        str3 = "{}";
                    }
                    try {
                        jSONObject3 = new org.json.JSONObject(str3);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram, parse extraData fail", e17);
                        jSONObject3 = new org.json.JSONObject();
                    }
                    hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jSONObject3);
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "navigate back MiniProgram success");
                    yVar2.a(i28, hVar.p("ok", hashMap2));
                }
                dead();
                return false;
            }
        };
        this.f80956i = iListener2;
        iListener2.alive();
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.h(3, optString, optString2, appId, null, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.k(this, yVar, i17, optString2, jSONObject2, i19, dVar, jSONObject));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h C() {
        return com.tencent.mm.plugin.appbrand.jsapi.fakenative.y.f81001c;
    }

    public final void D(com.tencent.mm.plugin.appbrand.y yVar, int i17, int i18, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i18));
        yVar.a(i17, p(str, hashMap));
    }
}
