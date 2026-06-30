package com.tencent.kinda.framework.jsapi;

/* loaded from: classes16.dex */
public class requestQueryCashierJsHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.requestQueryCashierJsHandler";
    public int type;

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.requestQueryCashierJsHandler.1
            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback) {
                am.hi hiVar = kindaJSInvokeEvent.f54458h;
                if (hiVar.f6835a == null) {
                    hiVar.f6835a = new android.os.Bundle();
                }
                kindaJSInvokeEvent.f54458h.f6835a.putInt("closeWindow", 1);
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaEndWithResult(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.jsapi.requestQueryCashierJsHandler.TAG, "callback: %s", str);
                am.hi hiVar = kindaJSInvokeEvent.f54458h;
                if (hiVar.f6835a == null) {
                    hiVar.f6835a = new android.os.Bundle();
                }
                kindaJSInvokeEvent.f54458h.f6835a.putString("ret", str);
                kindaJSInvokeEvent.f54457g.f6767d.run();
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                return kindaJSInvokeEvent.f54457g.f6764a == 1 ? com.tencent.kinda.gen.KindaJSEventType.TINYAPP : com.tencent.kinda.gen.KindaJSEventType.WEB;
            }
        });
        boolean isUseCaseAlive = ((h45.q) i95.n0.c(h45.q.class)).isUseCaseAlive("floatPay");
        if (!((java.util.ArrayList) ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID)).isEmpty()) {
            com.tencent.mars.xlog.Log.i(TAG, "current LiteApp is exist: wxalite2264f3d3bd4efb9d089e6893879d404f");
            isUseCaseAlive = true;
        }
        if (!isUseCaseAlive) {
            com.tencent.mars.xlog.Log.e(TAG, "floatpay usecase not alive, ignore notify and return fail");
            am.hi hiVar = kindaJSInvokeEvent.f54458h;
            if (hiVar.f6835a == null) {
                hiVar.f6835a = new android.os.Bundle();
            }
            kindaJSInvokeEvent.f54458h.f6835a.putString("ret", "fail");
            kindaJSInvokeEvent.f54457g.f6767d.run();
            return;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("jsEvent", kindaJSEvent);
        create.putString("notifyType", kindaJSInvokeEvent.f54457g.f6765b.getString("notifyType"));
        am.gi giVar = kindaJSInvokeEvent.f54457g;
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
        com.tencent.mars.xlog.Log.i(TAG, "data: %s", giVar.f6765b.toString());
        ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return com.tencent.mm.plugin.appbrand.jsapi.y6.NAME;
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return this.type;
    }
}
