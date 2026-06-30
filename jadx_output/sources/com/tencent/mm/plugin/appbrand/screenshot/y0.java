package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f88592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.z0 f88594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, com.tencent.mm.plugin.appbrand.screenshot.z0 z0Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f88593e = str;
        this.f88594f = z0Var;
        this.f88595g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.screenshot.y0(this.f88593e, this.f88594f, this.f88595g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.screenshot.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f88592d;
        java.lang.String str = this.f88593e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.appbrand.screenshot.v0 v0Var = (com.tencent.mm.plugin.appbrand.screenshot.v0) com.tencent.mm.plugin.appbrand.screenshot.z0.f88597h.get(str);
                java.lang.String str2 = v0Var != null ? v0Var.f88583b : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: savePath=" + str2);
                com.tencent.mm.plugin.appbrand.screenshot.z0 z0Var = this.f88594f;
                java.lang.String str3 = this.f88595g;
                this.f88592d = 1;
                obj = com.tencent.mm.plugin.appbrand.screenshot.z0.C(z0Var, str3, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: download success, posterTaskId=" + str);
                com.tencent.mm.plugin.appbrand.screenshot.z0.f88596g.a(str, bitmap);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: download failed, posterTaskId=" + str);
                com.tencent.mm.plugin.appbrand.screenshot.z0.f88596g.a(str, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: exception occurred, posterTaskId=" + str, e17);
            com.tencent.mm.plugin.appbrand.screenshot.z0.f88596g.a(str, null);
        }
        return jz5.f0.f302826a;
    }
}
