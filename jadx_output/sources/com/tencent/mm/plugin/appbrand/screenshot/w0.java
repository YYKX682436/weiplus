package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes3.dex */
public final class w0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f88589b;

    public w0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        this.f88588a = str;
        this.f88589b = continuation;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f88588a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously onImageDownload success? %s=%b", str, valueOf);
        this.f88589b.resumeWith(kotlin.Result.m521constructorimpl(z17 ? com.tencent.mm.sdk.platformtools.x.J(str, null) : null));
    }
}
