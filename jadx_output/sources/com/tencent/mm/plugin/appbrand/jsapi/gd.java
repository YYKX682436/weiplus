package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class gd implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81261a;

    public gd(yz5.a aVar) {
        this.f81261a = aVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetTextStatus", "onReceiveResult, setTextStatus done");
        this.f81261a.invoke();
    }
}
