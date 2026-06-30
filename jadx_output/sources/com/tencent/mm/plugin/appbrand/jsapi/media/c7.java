package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class c7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e7 f81746d;

    public c7(com.tencent.mm.plugin.appbrand.jsapi.media.e7 e7Var) {
        this.f81746d = e7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
        com.tencent.mm.plugin.appbrand.jsapi.media.e7 e7Var = this.f81746d;
        e7Var.f81789d.f81686w.cancel();
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = e7Var.f81789d;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81680q = 1;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81681r = 1;
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.d();
    }
}
