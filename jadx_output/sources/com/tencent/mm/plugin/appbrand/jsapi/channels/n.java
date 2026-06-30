package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.o f80258c;

    public n(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.o oVar) {
        this.f80256a = lVar;
        this.f80257b = i17;
        this.f80258c = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult enterFinderResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderResult) appBrandProxyUIProcessTask$ProcessResult;
        if (enterFinderResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = enterFinderResult.f80201d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.channels.o oVar = this.f80258c;
        this.f80256a.a(this.f80257b, i17 == 0 ? oVar.s("ok", oVar.I(enterFinderResult.f80202e)) : oVar.o(oVar.H("fail:internal error", i17)));
    }
}
