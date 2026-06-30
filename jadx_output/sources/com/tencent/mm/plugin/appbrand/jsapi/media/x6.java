package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class x6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject f82134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask f82137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82138h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82139i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.g7 f82140m;

    public x6(com.tencent.mm.plugin.appbrand.jsapi.media.g7 g7Var, com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject appBrandLocalMediaObject, android.content.Context context, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82140m = g7Var;
        this.f82134d = appBrandLocalMediaObject;
        this.f82135e = context;
        this.f82136f = str;
        this.f82137g = jsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask;
        this.f82138h = lVar;
        this.f82139i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject appBrandLocalMediaObject = this.f82134d;
        boolean isEmpty = android.text.TextUtils.isEmpty(appBrandLocalMediaObject.f76104f);
        android.content.Context context = this.f82135e;
        db5.e1.u(context, context.getString(com.tencent.mm.R.string.a2i, (isEmpty || !appBrandLocalMediaObject.f76104f.contains("video")) ? context.getString(com.tencent.mm.R.string.a2g) : context.getString(com.tencent.mm.R.string.a2m), this.f82136f), context.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.appbrand.jsapi.media.v6(this), new com.tencent.mm.plugin.appbrand.jsapi.media.w6(this));
    }
}
