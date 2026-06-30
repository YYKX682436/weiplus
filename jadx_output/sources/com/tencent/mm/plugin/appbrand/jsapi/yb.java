package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class yb implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f83943a;

    public yb(yz5.q qVar) {
        this.f83943a = qVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        pj4.r0 r0Var;
        com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult publishTextStatusResult = (com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult) appBrandProxyUIProcessTask$ProcessResult;
        if (publishTextStatusResult.f78669f != null) {
            r0Var = new pj4.r0();
            r0Var.parseFrom(publishTextStatusResult.f78669f);
        } else {
            r0Var = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPublishWechatStateActivity", "onReceiveResult, publishTextStatus done," + publishTextStatusResult.f78667d + ' ' + publishTextStatusResult.f78668e + ' ' + r0Var);
        this.f83943a.invoke(java.lang.Integer.valueOf(publishTextStatusResult.f78667d), publishTextStatusResult.f78668e, r0Var);
    }
}
