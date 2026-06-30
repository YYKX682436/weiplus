package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class e3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 29;
    public static final java.lang.String NAME = "chooseImage";

    /* renamed from: g, reason: collision with root package name */
    public boolean f81781g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest f81782h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.u f81783i;

    public static org.json.JSONArray C(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseImage", "data is null");
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            jSONArray.put(arrayList.get(i17));
        }
        return jSONArray;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar.getAppId() == null) {
            lVar.a(i17, o("fail"));
            return;
        }
        if (com.tencent.mm.plugin.appbrand.m6.b(lVar.getAppId()).f85713f) {
            lVar.a(i17, o("cancel"));
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            return;
        }
        this.f81782h = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        java.lang.String optString = jSONObject.optString("sizeType");
        java.lang.String optString2 = jSONObject.optString("count");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "doChooseImage sourceType = %s, sizeType = %s, count = %s", optJSONArray, optString, optString2);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest = this.f81782h;
            jsApiChooseImage$ChooseRequest.f81627f = true;
            jsApiChooseImage$ChooseRequest.f81628g = true;
        } else {
            this.f81782h.f81627f = optJSONArray.toString().contains("camera");
            this.f81782h.f81628g = optJSONArray.toString().contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM);
        }
        com.tencent.mm.plugin.appbrand.m6.a(lVar.getAppId()).f85713f = true;
        com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.l2(this, lVar));
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = "compressed";
        }
        this.f81782h.f81629h = optString.contains("compressed");
        this.f81782h.f81630i = optString.contains("original");
        this.f81782h.f81626e = com.tencent.mm.sdk.platformtools.t8.P(optString2, 9);
        this.f81782h.f81625d = lVar.getAppId();
        this.f81783i = new com.tencent.mm.plugin.appbrand.jsapi.media.m2(this, lVar, i17);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest2 = this.f81782h;
        if (jsApiChooseImage$ChooseRequest2.f81627f && jsApiChooseImage$ChooseRequest2.f81628g) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.jsapi.media.p2(this, lVar, jSONObject, i17, context));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "start select");
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest3 = this.f81782h;
        if (jsApiChooseImage$ChooseRequest3.f81628g && !jsApiChooseImage$ChooseRequest3.f81627f && !E(lVar, jSONObject, i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest jsApiChooseImage$ChooseRequest4 = this.f81782h;
        if (jsApiChooseImage$ChooseRequest4.f81628g || !jsApiChooseImage$ChooseRequest4.f81627f || D(lVar, jSONObject, i17)) {
            com.tencent.mm.plugin.appbrand.ipc.d.b(context, this.f81782h, this.f81783i);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
        }
    }

    public final boolean D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (!this.f81781g) {
            si1.e1.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.q2(this, lVar, i17));
            this.f81781g = true;
        }
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) context, lVar, "android.permission.CAMERA", 113, "", "");
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission fail, abort");
            return false;
        }
        si1.e1.c(lVar.getAppId());
        this.f81781g = false;
        return true;
    }

    public final boolean E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        if (!this.f81781g) {
            si1.e1.a(lVar.getAppId(), new com.tencent.mm.plugin.appbrand.jsapi.media.q2(this, lVar, i17));
            this.f81781g = true;
        }
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            lVar.a(i17, o("fail"));
            z17 = false;
        } else {
            z17 = android.os.Build.VERSION.SDK_INT >= 29 ? nf.t.a((android.app.Activity) context, lVar, "android.permission.READ_EXTERNAL_STORAGE", 145, "", "") : nf.t.a((android.app.Activity) context, lVar, "android.permission.WRITE_EXTERNAL_STORAGE", 145, "", "");
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission fail, abort");
            return false;
        }
        si1.e1.c(lVar.getAppId());
        this.f81781g = false;
        return true;
    }
}
