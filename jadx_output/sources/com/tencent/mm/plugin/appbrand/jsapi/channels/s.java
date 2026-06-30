package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.t f80267c;

    public s(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.t tVar) {
        this.f80265a = lVar;
        this.f80266b = i17;
        this.f80267c = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionResult openChannelsLiveCollectionResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionResult) appBrandProxyUIProcessTask$ProcessResult;
        if (openChannelsLiveCollectionResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = openChannelsLiveCollectionResult.f80208d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.channels.t tVar = this.f80267c;
        this.f80265a.a(this.f80266b, i17 == 0 ? tVar.o("ok") : tVar.o("fail:internal error"));
    }
}
