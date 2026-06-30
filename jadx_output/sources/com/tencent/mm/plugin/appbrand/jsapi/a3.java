package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class a3 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.b3 f78687a;

    public a3(com.tencent.mm.plugin.appbrand.jsapi.b3 b3Var) {
        this.f78687a = b3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        if (appBrandProxyUIProcessTask$ProcessResult instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult) {
            int i17 = ((com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavResult) appBrandProxyUIProcessTask$ProcessResult).f78511d;
            com.tencent.mm.plugin.appbrand.jsapi.b3 b3Var = this.f78687a;
            if (i17 == 0) {
                b3Var.f79818a.a(b3Var.f79824g, b3Var.f79825h.o("ok"));
            } else {
                b3Var.f79818a.a(b3Var.f79824g, b3Var.f79825h.o(java.lang.String.format("fail internal error:%d", java.lang.Integer.valueOf(i17))));
            }
        }
    }
}
