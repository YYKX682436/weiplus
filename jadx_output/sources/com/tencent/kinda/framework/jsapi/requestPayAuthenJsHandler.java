package com.tencent.kinda.framework.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/requestPayAuthenJsHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "TAG", "Ljava/lang/String;", "type", "I", "getType", "()I", "setType", "(I)V", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class requestPayAuthenJsHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private final java.lang.String TAG = "MicroMsg.requestPayAuthenJsHandler";
    private int type;

    public final int getType() {
        return this.type;
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.requestPayAuthenJsHandler$handle$1
            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback completion) {
                kotlin.jvm.internal.o.g(completion, "completion");
                am.hi hiVar = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54458h;
                if (hiVar.f6835a == null) {
                    hiVar.f6835a = new android.os.Bundle();
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54458h.f6835a.putInt("closeWindow", 1);
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaEndWithResult(java.lang.String result, java.util.HashMap<java.lang.String, java.lang.String> extraInfo) {
                java.lang.String str;
                kotlin.jvm.internal.o.g(result, "result");
                kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
                str = this.TAG;
                com.tencent.mars.xlog.Log.i(str, "callback: %s", result);
                am.hi hiVar = com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54458h;
                if (hiVar.f6835a == null) {
                    hiVar.f6835a = new android.os.Bundle();
                }
                com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54458h.f6835a.putString("ret", result);
                com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54457g.f6767d.run();
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                return com.tencent.mm.autogen.events.KindaJSInvokeEvent.this.f54457g.f6764a == 1 ? com.tencent.kinda.gen.KindaJSEventType.TINYAPP : com.tencent.kinda.gen.KindaJSEventType.WEB;
            }
        });
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("jsEvent", kindaJSEvent);
        am.gi giVar = event.f54457g;
        create.putString("notifyType", giVar.f6765b.getString("notifyType"));
        create.putString("appId", giVar.f6765b.getString("appId"));
        create.putString("nonceStr", giVar.f6765b.getString("nonceStr"));
        create.putString("timeStamp", giVar.f6765b.getString("timeStamp"));
        create.putString("package", giVar.f6765b.getString("package"));
        create.putString("paySign", giVar.f6765b.getString("paySign"));
        create.putString("signType", giVar.f6765b.getString("signType"));
        int i17 = giVar.f6764a;
        if (i17 == 1) {
            create.putInt("jsApiScene", 1);
        } else if (i17 == 0) {
            create.putInt("jsApiScene", 2);
        }
        com.tencent.mars.xlog.Log.i(this.TAG, "data: %s", giVar.f6765b.toString());
        ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
        am.hi hiVar = event.f54458h;
        if (hiVar.f6835a == null) {
            hiVar.f6835a = new android.os.Bundle();
        }
        hiVar.f6835a.putString("ret", "fail");
        giVar.f6767d.run();
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return "requestPayAuthen";
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return this.type;
    }

    public final void setType(int i17) {
        this.type = i17;
    }
}
