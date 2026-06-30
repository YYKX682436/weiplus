package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyDcpPaymentCallbackHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class NotifyDcpPaymentCallbackHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        if (kindaJSInvokeEvent == null) {
            return;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("notifyType", com.tencent.mm.plugin.appbrand.jsapi.pay.z.NAME);
        create.putString("jsApiName", com.tencent.mm.plugin.appbrand.jsapi.pay.z.NAME);
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        create.putString("dcp_token", giVar.f6765b.getString("dcp_token", ""));
        create.putString("ret_status", giVar.f6765b.getString("ret_status"));
        ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.z.NAME;
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return 0;
    }
}
