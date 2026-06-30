package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class z3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 193;
    public static final java.lang.String NAME = "chooseMedia";

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f82166h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f82167g = false;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        if (f82166h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia sChoosingMedia is true, do not again");
            lVar.a(i17, o("cancel"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia %s", jSONObject);
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            lVar.a(i17, o("fail:page context is null"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia data:" + jSONObject.toString());
        if (jSONObject.optJSONArray("sourceType") == null || jSONObject.optJSONArray("sourceType").length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "sourceType is invalid param");
            str = "";
        } else {
            str = jSONObject.optJSONArray("sourceType").toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "camera|album";
        }
        if (jSONObject.optJSONArray("mediaType") == null || jSONObject.optJSONArray("mediaType").length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mediaType is invalid param");
            str2 = "";
        } else {
            str2 = jSONObject.optJSONArray("mediaType").toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "video|image";
        }
        int min = java.lang.Math.min(jSONObject.optInt("maxDuration", 10), 60);
        if (min < 3 || min > 60) {
            lVar.a(i17, o("fail:error maxDuration"));
            return;
        }
        java.lang.String optString = jSONObject.optString("camera");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = "back";
        }
        int min2 = java.lang.Math.min(jSONObject.optInt("count", 20), 20);
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        java.lang.String str3 = "";
        boolean z18 = jSONObject.optBoolean("supportLivePhoto") && qp.b.f365678e;
        if (jSONObject.optJSONArray("sizeType") == null || jSONObject.optJSONArray("sizeType").length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "sizeType is invalid param");
        } else {
            str3 = jSONObject.optJSONArray("sizeType").toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = "original|compressed";
        }
        java.lang.String str4 = str3;
        boolean z19 = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s, supportLivePhoto:%b", str, str2, java.lang.Integer.valueOf(min), optString, java.lang.Integer.valueOf(min2), str4, java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest();
        jsApiChooseMedia$ChooseRequest.f81634d = lVar.getAppId();
        jsApiChooseMedia$ChooseRequest.f81635e = str.contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        jsApiChooseMedia$ChooseRequest.f81636f = str.contains("camera");
        jsApiChooseMedia$ChooseRequest.f81637g = str2.contains("image");
        jsApiChooseMedia$ChooseRequest.f81638h = str2.contains("video");
        jsApiChooseMedia$ChooseRequest.f81639i = str2.contains("mix");
        try {
            jsApiChooseMedia$ChooseRequest.f81646s = ((com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) ((com.tencent.mm.plugin.appbrand.y) lVar).t3().E0()).D1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "err" + e17.getMessage());
        }
        if (optString.contains("back")) {
            jsApiChooseMedia$ChooseRequest.f81640m = false;
            z17 = true;
        } else if (optString.contains("front")) {
            z17 = true;
            jsApiChooseMedia$ChooseRequest.f81640m = true;
        } else {
            z17 = true;
            jsApiChooseMedia$ChooseRequest.f81640m = false;
        }
        jsApiChooseMedia$ChooseRequest.f81641n = min;
        jsApiChooseMedia$ChooseRequest.f81642o = min2;
        jsApiChooseMedia$ChooseRequest.f81643p = z19;
        jsApiChooseMedia$ChooseRequest.f81644q = str4.contains("compressed");
        jsApiChooseMedia$ChooseRequest.f81645r = str4.contains("original");
        if (!this.f82167g) {
            si1.e1.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.m3(this, lVar, jSONObject, i17, jsApiChooseMedia$ChooseRequest));
            this.f82167g = z17;
        }
        if (jsApiChooseMedia$ChooseRequest.f81635e && jsApiChooseMedia$ChooseRequest.f81636f) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.media.f3(this, lVar, jSONObject, i17, jsApiChooseMedia$ChooseRequest));
        } else {
            C(lVar, jSONObject, i17, jsApiChooseMedia$ChooseRequest);
        }
    }

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest) {
        boolean z17;
        boolean z18;
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "invokeInternalImpl");
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
            lVar.a(i17, o("fail:page context is null"));
            return;
        }
        if (jsApiChooseMedia$ChooseRequest.f81635e && android.os.Build.VERSION.SDK_INT < 29) {
            android.content.Context context2 = lVar.getContext();
            if (context2 == null || !(context2 instanceof android.app.Activity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestExternalStoragePermission pageContext is null");
                lVar.a(i17, o("fail"));
                z18 = false;
            } else {
                z18 = nf.t.a((android.app.Activity) context2, lVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
            }
            if (!z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestExternalStoragePermission is fail");
                return;
            }
        }
        if (jsApiChooseMedia$ChooseRequest.f81636f && (jsApiChooseMedia$ChooseRequest.f81637g || jsApiChooseMedia$ChooseRequest.f81638h)) {
            android.content.Context context3 = lVar.getContext();
            if (context3 == null || !(context3 instanceof android.app.Activity)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestCameraPermission pageContext is null");
                lVar.a(i17, o("fail"));
                z17 = false;
            } else {
                z17 = nf.t.a((android.app.Activity) context3, lVar, "android.permission.CAMERA", 119, "", "");
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestCameraPermission is fail");
                return;
            }
        }
        if (jsApiChooseMedia$ChooseRequest.f81636f) {
            boolean z19 = jsApiChooseMedia$ChooseRequest.f81638h;
        }
        si1.e1.c(lVar.getAppId());
        this.f82167g = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "do chooseMedia");
        f82166h = true;
        com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.k3(this, lVar));
        com.tencent.mm.plugin.appbrand.jsapi.media.l3 l3Var = new com.tencent.mm.plugin.appbrand.jsapi.media.l3(this, lVar, i17);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiChooseMedia$ChooseRequest, l3Var, null);
    }
}
