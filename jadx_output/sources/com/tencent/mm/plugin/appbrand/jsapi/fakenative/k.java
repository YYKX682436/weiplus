package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class k implements com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f80972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80974c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d f80977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.h f80979h;

    public k(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar, com.tencent.mm.plugin.appbrand.y yVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, org.json.JSONObject jSONObject2) {
        this.f80979h = hVar;
        this.f80972a = yVar;
        this.f80973b = i17;
        this.f80974c = str;
        this.f80975d = jSONObject;
        this.f80976e = i18;
        this.f80977f = dVar;
        this.f80978g = jSONObject2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void a(int i17, java.lang.String str, boolean z17, r45.bl blVar, r45.j14 j14Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = this.f80979h;
        hVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.m(hVar));
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(j14Var != null ? j14Var.f377493f : 0);
        objArr[3] = j14Var != null ? j14Var.f377492e : "";
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram fail, CGI errCode:%d, errMsg:%s, backendErrno:%d, backendErrmsg:%s", objArr);
        int i18 = this.f80973b;
        com.tencent.mm.plugin.appbrand.y yVar = this.f80972a;
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for network issues" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject.put("errno", 108);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i18, hVar.u(str2, jSONObject));
            return;
        }
        if (j14Var == null || android.text.TextUtils.isEmpty(j14Var.f377492e)) {
            hVar.D(yVar, i18, -2, "fail CGI error");
            return;
        }
        int i19 = j14Var.f377493f;
        java.lang.String str5 = j14Var.f377492e;
        java.util.Map singletonMap = java.util.Collections.singletonMap("errCode", java.lang.Integer.valueOf(j14Var.f377491d));
        str2 = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(singletonMap instanceof java.util.HashMap)) {
            singletonMap = singletonMap == null ? new java.util.HashMap() : new java.util.HashMap(singletonMap);
        }
        singletonMap.put("errno", java.lang.Integer.valueOf(i19));
        yVar.a(i18, hVar.t(str2, singletonMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0
    public void b(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, r45.bl blVar) {
        final com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = this.f80979h;
        hVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.m(hVar));
        if (hVar.f80954g) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        final com.tencent.mm.plugin.appbrand.y yVar = this.f80972a;
        final int i17 = this.f80973b;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram, invalid businessType");
            hVar.D(yVar, i17, -4, "fail invalid businessType");
            return;
        }
        if (!z18) {
            com.tencent.mm.plugin.appbrand.jsapi.fakenative.y.f81001c.c(yVar, str, this.f80976e, str2, this.f80977f, this.f80978g, null, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.j(this, str, str2, z17));
            return;
        }
        java.lang.String str3 = str2.split(java.util.regex.Pattern.quote("?"))[0];
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest wxaOpenLiteAppBusinessViewRequest = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest();
        wxaOpenLiteAppBusinessViewRequest.f80901d = blVar.f370829d;
        wxaOpenLiteAppBusinessViewRequest.f80902e = blVar.f370830e;
        wxaOpenLiteAppBusinessViewRequest.f80903f = blVar.f370831f;
        wxaOpenLiteAppBusinessViewRequest.f80904g = blVar.f370832g;
        wxaOpenLiteAppBusinessViewRequest.f80905h = blVar.f370833h;
        wxaOpenLiteAppBusinessViewRequest.f80906i = blVar.f370834i;
        wxaOpenLiteAppBusinessViewRequest.f80907m = blVar.f370835m;
        wxaOpenLiteAppBusinessViewRequest.f80908n = blVar.f370836n;
        wxaOpenLiteAppBusinessViewRequest.f80909o = blVar.f370837o;
        wxaOpenLiteAppBusinessViewRequest.f80910p = blVar.f370838p;
        wxaOpenLiteAppBusinessViewRequest.f80911q = blVar.f370839q;
        wxaOpenLiteAppBusinessViewRequest.f80912r = blVar.f370840r;
        wxaOpenLiteAppBusinessViewRequest.f80913s = this.f80974c;
        wxaOpenLiteAppBusinessViewRequest.f80914t = str;
        wxaOpenLiteAppBusinessViewRequest.f80915u = str3;
        wxaOpenLiteAppBusinessViewRequest.f80916v = yVar.getAppId();
        wxaOpenLiteAppBusinessViewRequest.f80917w = this.f80975d.toString();
        com.tencent.mm.plugin.appbrand.ipc.u uVar = new com.tencent.mm.plugin.appbrand.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.h$$a
            @Override // com.tencent.mm.plugin.appbrand.ipc.u
            public final void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
                java.lang.String str4;
                java.lang.String str5;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult wxaOpenLiteAppBusinessViewResult = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult) appBrandProxyUIProcessTask$ProcessResult;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar2 = com.tencent.mm.plugin.appbrand.jsapi.fakenative.h.this;
                hVar2.getClass();
                com.tencent.mm.plugin.appbrand.y yVar2 = yVar;
                int i18 = i17;
                if (wxaOpenLiteAppBusinessViewResult == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "onReceiveResult get NULL result");
                    str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str4 != null ? str4 : "";
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 4);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    yVar2.a(i18, hVar2.u(str5, jSONObject));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBusinessView", "onReceiveResult result:" + wxaOpenLiteAppBusinessViewResult.f80919e + " data:" + wxaOpenLiteAppBusinessViewResult.f80918d);
                jc1.d dVar = new jc1.d(wxaOpenLiteAppBusinessViewResult.f80918d, wxaOpenLiteAppBusinessViewResult.f80919e);
                if (wxaOpenLiteAppBusinessViewResult.f80920f == null) {
                    yVar2.a(i18, hVar2.r(null, dVar, null));
                    return;
                }
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, wxaOpenLiteAppBusinessViewResult.f80920f);
                    yVar2.a(i18, hVar2.r(null, dVar, jSONObject2));
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBusinessView", "onReceiveResult json exception: ", e18);
                    str4 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str5 = str4 != null ? str4 : "";
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 4);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                    }
                    yVar2.a(i18, hVar2.u(str5, jSONObject3));
                }
            }
        };
        android.content.Context f147807d = yVar.getF147807d();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, wxaOpenLiteAppBusinessViewRequest, uVar, null);
    }
}
