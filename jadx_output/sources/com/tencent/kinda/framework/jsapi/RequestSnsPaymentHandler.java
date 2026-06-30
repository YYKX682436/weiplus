package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/RequestSnsPaymentHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class RequestSnsPaymentHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.RequestSnsPayment";

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        am.gi giVar;
        am.gi giVar2;
        android.os.Bundle bundle;
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1
            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback completion) {
                am.hi hiVar;
                android.os.Bundle bundle2;
                am.hi hiVar2;
                kotlin.jvm.internal.o.g(completion, "completion");
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent2 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                if (((kindaJSInvokeEvent2 == null || (hiVar2 = kindaJSInvokeEvent2.f54458h) == null) ? null : hiVar2.f6835a) == null) {
                    am.hi hiVar3 = kindaJSInvokeEvent2 != null ? kindaJSInvokeEvent2.f54458h : null;
                    if (hiVar3 != null) {
                        hiVar3.f6835a = new android.os.Bundle();
                    }
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent3 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                if (kindaJSInvokeEvent3 == null || (hiVar = kindaJSInvokeEvent3.f54458h) == null || (bundle2 = hiVar.f6835a) == null) {
                    return;
                }
                bundle2.putInt("closeWindow", 1);
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaEndWithResult(java.lang.String result, java.util.HashMap<java.lang.String, java.lang.String> extraInfo) {
                am.gi giVar3;
                java.lang.Runnable runnable;
                am.hi hiVar;
                android.os.Bundle bundle2;
                am.hi hiVar2;
                android.os.Bundle bundle3;
                am.hi hiVar3;
                kotlin.jvm.internal.o.g(result, "result");
                kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
                com.tencent.mars.xlog.Log.i("MicroMsg.RequestSnsPayment", "callback: %s", result);
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent2 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                if (((kindaJSInvokeEvent2 == null || (hiVar3 = kindaJSInvokeEvent2.f54458h) == null) ? null : hiVar3.f6835a) == null) {
                    am.hi hiVar4 = kindaJSInvokeEvent2 != null ? kindaJSInvokeEvent2.f54458h : null;
                    if (hiVar4 != null) {
                        hiVar4.f6835a = new android.os.Bundle();
                    }
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraInfo.entrySet()) {
                    com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent3 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                    if (kindaJSInvokeEvent3 != null && (hiVar2 = kindaJSInvokeEvent3.f54458h) != null && (bundle3 = hiVar2.f6835a) != null) {
                        bundle3.putString(entry.getKey(), entry.getValue());
                    }
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent4 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                if (kindaJSInvokeEvent4 != null && (hiVar = kindaJSInvokeEvent4.f54458h) != null && (bundle2 = hiVar.f6835a) != null) {
                    bundle2.putString("ret", result);
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent5 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                if (kindaJSInvokeEvent5 == null || (giVar3 = kindaJSInvokeEvent5.f54457g) == null || (runnable = giVar3.f6767d) == null) {
                    return;
                }
                runnable.run();
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                am.gi giVar3;
                com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent2 = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this;
                boolean z17 = false;
                if (kindaJSInvokeEvent2 != null && (giVar3 = kindaJSInvokeEvent2.f54457g) != null && giVar3.f6764a == 1) {
                    z17 = true;
                }
                return z17 ? com.tencent.kinda.gen.KindaJSEventType.WEB : com.tencent.kinda.gen.KindaJSEventType.TINYAPP;
            }
        });
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("JSEvent", kindaJSEvent);
        if (kindaJSInvokeEvent != null && (giVar2 = kindaJSInvokeEvent.f54457g) != null && (bundle = giVar2.f6765b) != null) {
            create.putInt("payScene", bundle.getInt("payScene", 2));
            create.putString("appId", bundle.getString("appId"));
            create.putString("timeStamp", bundle.getString("timeStamp"));
            create.putString("nonceStr", bundle.getString("nonceStr"));
            create.putString("package", bundle.getString("package"));
            create.putString("signType", bundle.getString("signType"));
            create.putString("paySign", bundle.getString("paySign"));
            create.putString("prepayId", bundle.getString("prepayId"));
            create.putString("partnerId", bundle.getString("partnerId"));
            create.putString("bindSerial", bundle.getString("bindSerial"));
            create.putString("bankType", bundle.getString("bankType"));
            create.putString("paymentDeskModalTitle", bundle.getString("paymentDeskModalTitle"));
        }
        java.util.Objects.toString((kindaJSInvokeEvent == null || (giVar = kindaJSInvokeEvent.f54457g) == null) ? null : giVar.f6765b);
        com.tencent.kinda.framework.boot.KindaApp.appKinda().startUseCase("snsJsapiPay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$2
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return "requestSnsPayment";
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return 0;
    }
}
