package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class g7 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 194;
    public static final java.lang.String NAME = "uploadEncryptedFileToCDN";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context context = lVar.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
            lVar.a(i17, o("fail"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String appId = lVar.getAppId();
        java.lang.String optString = jSONObject.optString("tempFilePath");
        boolean optBoolean = jSONObject.optBoolean("isShowProgressTips", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", appId, jSONObject.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
            lVar.a(i17, o("fail:tempFilePath is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject d17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.d(appId, optString);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        if (android.text.TextUtils.isEmpty(d17.f76103e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
            lVar.a(i17, o("fail:fileFullPath is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask();
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81672f = appId;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81673g = optString;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81674h = optBoolean;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u = (android.app.Activity) context;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81685v = lVar;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81682s = d17.f76104f;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81683t = new com.tencent.mm.plugin.appbrand.jsapi.media.u6(this, jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask, lVar, i17);
        if (com.tencent.mm.network.y2.a(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
            jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.d();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.media.x6(this, d17, context, com.tencent.mm.sdk.platformtools.t8.h0((int) com.tencent.mm.vfs.w6.k(d17.f76103e)), jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask, lVar, i17));
        }
    }
}
