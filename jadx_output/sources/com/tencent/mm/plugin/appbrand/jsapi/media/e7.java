package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class e7 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask f81789d;

    public e7(com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask) {
        this.f81789d = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = this.f81789d;
        java.lang.String string = (android.text.TextUtils.isEmpty(jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81682s) || !jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81682s.contains("video")) ? jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u.getString(com.tencent.mm.R.string.a2g) : jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u.getString(com.tencent.mm.R.string.a2m);
        android.app.Activity activity = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u;
        db5.e1.K(activity, true, activity.getString(com.tencent.mm.R.string.a2h, string), "", jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u.getString(com.tencent.mm.R.string.a2j), jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81684u.getString(com.tencent.mm.R.string.a2k), new com.tencent.mm.plugin.appbrand.jsapi.media.c7(this), new com.tencent.mm.plugin.appbrand.jsapi.media.d7(this));
        return true;
    }
}
