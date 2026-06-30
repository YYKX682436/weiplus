package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class b7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask f81728d;

    public b7(com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask) {
        this.f81728d = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel uploading the media file");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = this.f81728d;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81680q = 1;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81681r = 1;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.d();
    }
}
