package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class da implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ea f80753c;

    public da(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.ea eaVar) {
        this.f80751a = lVar;
        this.f80752b = i17;
        this.f80753c = eaVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult jsApiOpenTextStateMessage$OpenTextStateResult = (com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.JsApiOpenTextStateMessage", "onReceiveResult result:" + jsApiOpenTextStateMessage$OpenTextStateResult.f78585d);
        try {
            jSONObject = new org.json.JSONObject(jsApiOpenTextStateMessage$OpenTextStateResult.f78585d);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        this.f80751a.a(this.f80752b, this.f80753c.s("ok", jSONObject));
    }
}
