package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class u5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1162;
    public static final java.lang.String NAME = "cropImage";

    /* renamed from: g, reason: collision with root package name */
    public final int f82089g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.content.Context f147807d = e9Var.getF147807d();
        if (f147807d == null || !(f147807d instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "cropImage fail,  pageContext is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "cropImage fail,  data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCropImage", "data:%s", jSONObject);
        java.lang.String path = jSONObject.optString("src");
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (android.text.TextUtils.isEmpty(path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "cropImage fail,  src is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i17, u(str2, jSONObject4));
            return;
        }
        if (optInt > 0 && optInt2 > 0) {
            com.tencent.mm.plugin.appbrand.jsapi.media.t5 t5Var = new com.tencent.mm.plugin.appbrand.jsapi.media.t5(this, path, e9Var, i17, optInt2, optInt);
            kotlin.jvm.internal.o.g(path, "path");
            if (!r26.i0.y(path, "http://", false) && !r26.i0.y(path, "https://", false)) {
                r26.i0.y(path, "wxfile://", false);
            }
            com.tencent.mm.plugin.appbrand.utils.d0.c(e9Var, path, null, new com.tencent.mm.plugin.appbrand.utils.m5(t5Var, r26.i0.y(path, "wxfile://", false)));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCropImage", "cropImage fail,  width or height is illegal");
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 101);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        e9Var.a(i17, u(str2, jSONObject5));
    }
}
