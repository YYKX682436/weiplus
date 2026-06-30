package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class h5 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.i5 f81835c;

    public h5(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.i5 i5Var) {
        this.f81833a = lVar;
        this.f81834b = i17;
        this.f81835c = i5Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        boolean z17 = obj instanceof java.lang.Exception;
        com.tencent.mm.plugin.appbrand.jsapi.media.i5 i5Var = this.f81835c;
        int i17 = this.f81834b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81833a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiChooseVideoNew", "choose pipeline onInterrupt(" + obj + ')');
            lVar.a(i17, i5Var.o("fail:internal error"));
            return;
        }
        java.lang.String message = ((java.lang.Exception) obj).getMessage();
        if (message == null) {
            message = "";
        }
        if (!r26.i0.y(message, "fail", false)) {
            message = "fail ".concat(message);
        }
        lVar.a(i17, i5Var.o(message));
    }
}
