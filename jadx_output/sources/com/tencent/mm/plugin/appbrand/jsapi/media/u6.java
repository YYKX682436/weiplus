package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask f82090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.g7 f82093g;

    public u6(com.tencent.mm.plugin.appbrand.jsapi.media.g7 g7Var, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82093g = g7Var;
        this.f82090d = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask;
        this.f82091e = lVar;
        this.f82092f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask = this.f82090d;
        hashMap.put("fileId", jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i);
        hashMap.put("aesKey", jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81676m);
        hashMap.put("fileUrl", jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81677n);
        hashMap.put("fileLength", "" + jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81678o);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fileId:%s", jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.f81675i);
        com.tencent.mm.plugin.appbrand.jsapi.media.g7 g7Var = this.f82093g;
        int i17 = this.f82092f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82091e;
        if (K0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail , return serverId is empty");
            lVar.a(i17, g7Var.o("fail"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN ok");
            lVar.a(i17, g7Var.p("ok", hashMap));
        }
        jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask.x();
    }
}
