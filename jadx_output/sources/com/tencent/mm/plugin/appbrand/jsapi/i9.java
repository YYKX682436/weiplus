package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class i9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1565;
    public static final java.lang.String NAME = "openCameraForImageSearch";

    /* renamed from: g, reason: collision with root package name */
    public boolean f81309g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest f81310h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.u f81311i;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l service, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        if (service.getAppId() == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid appid" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1005);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str2, jSONObject));
            return;
        }
        if (com.tencent.mm.plugin.appbrand.m6.b(service.getAppId()).f85713f) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            service.a(i17, u(str2, jSONObject2));
            return;
        }
        android.content.Context context = service.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            service.a(i17, u(str2, jSONObject3));
            return;
        }
        boolean z18 = true;
        com.tencent.mm.plugin.appbrand.m6.a(service.getAppId()).f85713f = true;
        com.tencent.mm.plugin.appbrand.x0.a(service.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.g9(service));
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest();
        this.f81310h = jsApiOpenCameraForImageSearch$ChooseRequest;
        jsApiOpenCameraForImageSearch$ChooseRequest.r(true);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest2 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest2 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        jsApiOpenCameraForImageSearch$ChooseRequest2.m(false);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest3 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest3 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        jsApiOpenCameraForImageSearch$ChooseRequest3.n(true);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest4 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest4 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        jsApiOpenCameraForImageSearch$ChooseRequest4.o(1);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest5 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest5 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        jsApiOpenCameraForImageSearch$ChooseRequest5.i(service.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest6 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest6 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        jsApiOpenCameraForImageSearch$ChooseRequest6.q(data.toString());
        this.f81311i = new com.tencent.mm.plugin.appbrand.jsapi.h9(service, i17, this);
        if (!this.f81309g) {
            si1.e1.a(service.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.f9(service, this, i17));
            this.f81309g = true;
        }
        android.content.Context context2 = service.getContext();
        if (context2 == null || !(context2 instanceof android.app.Activity)) {
            java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str6 != null ? str6 : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            service.a(i17, u(str2, jSONObject4));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) context2, service, "android.permission.CAMERA", 113, "", "");
        }
        if (z17) {
            si1.e1.c(service.getAppId());
            this.f81309g = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission fail, abort");
            z18 = false;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission fail, abort");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseRequest jsApiOpenCameraForImageSearch$ChooseRequest7 = this.f81310h;
        if (jsApiOpenCameraForImageSearch$ChooseRequest7 == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        com.tencent.mm.plugin.appbrand.ipc.u uVar = this.f81311i;
        if (uVar == null) {
            kotlin.jvm.internal.o.o("mResultReceiver");
            throw null;
        }
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenCameraForImageSearch$ChooseRequest7, uVar, null);
    }
}
