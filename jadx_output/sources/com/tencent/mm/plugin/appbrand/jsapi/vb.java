package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class vb implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f83516a;

    public vb(yz5.a aVar) {
        this.f83516a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "onReceiveResult, setTextStatus done");
        this.f83516a.invoke();
    }
}
