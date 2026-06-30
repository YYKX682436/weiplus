package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyWCPayResultHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class NotifyWCPayResultHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.NotifyWCPayResultHandler";

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        android.os.Bundle bundle;
        if (kindaJSInvokeEvent == null) {
            return;
        }
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("JSEvent", kindaJSEvent);
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        if (giVar != null && (bundle = giVar.f6765b) != null) {
            create.putString("appId", bundle.getString("appId"));
            create.putString("timeStamp", bundle.getString("timeStamp"));
            create.putString("bizEventKey", bundle.getString("bizEventKey"));
            create.putString("JSAPIFunc", bundle.getString("jsapiName"));
        }
        java.util.Objects.toString(giVar != null ? giVar.f6765b : null);
        ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return "notifyWCPayResult";
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return 0;
    }
}
