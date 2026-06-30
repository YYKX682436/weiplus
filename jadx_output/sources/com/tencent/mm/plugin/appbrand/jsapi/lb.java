package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes11.dex */
final class lb extends com.tencent.mm.plugin.appbrand.ipc.v {
    private lb() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult jsApiPrivateAddContact$AddContactResult = new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactResult();
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateAddContact", "handleRequest !(request instanceof AddContactRequest)");
            jsApiPrivateAddContact$AddContactResult.f78597d = -1;
            finishProcess(jsApiPrivateAddContact$AddContactResult);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest jsApiPrivateAddContact$AddContactRequest = (com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact$AddContactRequest) appBrandProxyUIProcessTask$ProcessRequest;
            o25.a aVar = new o25.a();
            aVar.f342469g = jsApiPrivateAddContact$AddContactRequest.f78596f == 1;
            ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(getActivityContext(), jsApiPrivateAddContact$AddContactRequest.f78594d, jsApiPrivateAddContact$AddContactRequest.f78595e, new com.tencent.mm.plugin.appbrand.jsapi.kb(this, jsApiPrivateAddContact$AddContactResult), aVar)).f();
        }
    }
}
