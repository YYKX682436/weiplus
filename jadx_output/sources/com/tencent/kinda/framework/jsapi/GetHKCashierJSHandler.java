package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/GetHKCashierJSHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "TAG", "Ljava/lang/String;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class GetHKCashierJSHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private final java.lang.String TAG = "MicroMsg.GetHKCashierJSHandler";

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        java.lang.String str;
        am.gi giVar;
        android.os.Bundle bundle;
        am.gi giVar2;
        android.os.Bundle bundle2;
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler$handle$1
            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback) {
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaEndWithResult(java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                java.lang.String str3;
                am.gi giVar3;
                java.lang.Runnable runnable;
                java.lang.String str4;
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent2;
                am.hi hiVar;
                android.os.Bundle bundle3;
                am.hi hiVar2;
                android.os.Bundle bundle4;
                am.hi hiVar3;
                str3 = com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler.this.TAG;
                com.tencent.mars.xlog.Log.i(str3, "callback: %s", str2);
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent3 = kindaJSInvokeEvent;
                if (((kindaJSInvokeEvent3 == null || (hiVar3 = kindaJSInvokeEvent3.f54458h) == null) ? null : hiVar3.f6835a) == null) {
                    am.hi hiVar4 = kindaJSInvokeEvent3 != null ? kindaJSInvokeEvent3.f54458h : null;
                    if (hiVar4 != null) {
                        hiVar4.f6835a = new android.os.Bundle();
                    }
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent4 = kindaJSInvokeEvent;
                if (kindaJSInvokeEvent4 != null && (hiVar2 = kindaJSInvokeEvent4.f54458h) != null && (bundle4 = hiVar2.f6835a) != null) {
                    bundle4.putString("ret", str2);
                }
                if (hashMap != null && (str4 = hashMap.get("err_desc")) != null && (kindaJSInvokeEvent2 = kindaJSInvokeEvent) != null && (hiVar = kindaJSInvokeEvent2.f54458h) != null && (bundle3 = hiVar.f6835a) != null) {
                    bundle3.putString("err_desc", str4);
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent5 = kindaJSInvokeEvent;
                if (kindaJSInvokeEvent5 == null || (giVar3 = kindaJSInvokeEvent5.f54457g) == null || (runnable = giVar3.f6767d) == null) {
                    return;
                }
                runnable.run();
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                return com.tencent.kinda.gen.KindaJSEventType.WEB;
            }
        });
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("JSEvent", kindaJSEvent);
        if (kindaJSInvokeEvent != null && (giVar2 = kindaJSInvokeEvent.f54457g) != null && (bundle2 = giVar2.f6765b) != null) {
            create.putString("appId", bundle2.getString("appId"));
            create.putString("nonce_str", bundle2.getString("nonce_str"));
            create.putString("timeStamp", bundle2.getString("timeStamp"));
            create.putString("package", bundle2.getString("package"));
            create.putString("signType", bundle2.getString("signType"));
            create.putString("paySign", bundle2.getString("paySign"));
            create.putString("jsapiFunc", bundle2.getString("jsapiName"));
            create.putInt("sourceType", bundle2.getInt("sourceType"));
            create.putString("stepInURL", bundle2.getString("stepInURL"));
        }
        java.lang.String str2 = this.TAG;
        if (kindaJSInvokeEvent == null || (giVar = kindaJSInvokeEvent.f54457g) == null || (bundle = giVar.f6765b) == null || (str = bundle.toString()) == null) {
            str = "empty";
        }
        com.tencent.mars.xlog.Log.i(str2, "start call hkJsapiGetHKCashierUseCase, data is  : ".concat(str));
        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("hkJsapiGetHKCashierUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler$handle$2
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return "getHKCashier";
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return 0;
    }
}
