package com.tencent.kinda.framework.jsapi;

/* loaded from: classes16.dex */
public class PhoneBindCardEntryHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.PhoneBindCardEntryHandler";
    public int type;

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler.1
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
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler.TAG, "callback: %s", str);
                am.hi hiVar = kindaJSInvokeEvent.f54458h;
                if (hiVar.f6835a == null) {
                    hiVar.f6835a = new android.os.Bundle();
                }
                kindaJSInvokeEvent.f54458h.f6835a.putString("ret", str);
                kindaJSInvokeEvent.f54457g.f6767d.run();
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                return kindaJSInvokeEvent.f54457g.f6764a == 1 ? com.tencent.kinda.gen.KindaJSEventType.WEB : com.tencent.kinda.gen.KindaJSEventType.TINYAPP;
            }
        });
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("jsEvent", kindaJSEvent);
        create.putString("notifyType", com.tencent.mm.plugin.appbrand.jsapi.za.NAME);
        create.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, kindaJSInvokeEvent.f54457g.f6765b.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID));
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        create.putString("nonce_str", giVar.f6765b.getString("nonce_str"));
        create.putString("timeStamp", giVar.f6765b.getString("timeStamp"));
        create.putString("package", giVar.f6765b.getString("package"));
        create.putString("paySign", giVar.f6765b.getString("paySign"));
        create.putString("signType", giVar.f6765b.getString("signType"));
        create.putString("jsApiName", giVar.f6766c);
        create.putInt("bind_card_entrance_scene", 3);
        int i17 = giVar.f6764a;
        if (i17 == 1) {
            create.putInt("jsApiScene", 1);
        } else if (i17 == 0) {
            create.putInt("jsApiScene", 2);
        }
        giVar.f6765b.toString();
        com.tencent.kinda.framework.boot.KindaApp.appKinda().startUseCase("fastbindcard", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler.2
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return com.tencent.mm.plugin.appbrand.jsapi.za.NAME;
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return this.type;
    }
}
