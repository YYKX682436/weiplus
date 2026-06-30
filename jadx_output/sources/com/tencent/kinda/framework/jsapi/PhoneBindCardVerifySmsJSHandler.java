package com.tencent.kinda.framework.jsapi;

/* loaded from: classes16.dex */
public class PhoneBindCardVerifySmsJSHandler implements com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler {
    public static final java.lang.String LiteAppNotifyName = "JSAPIPhoneBindCardVerifySmsLiteAppNotifyEvent";
    private static final java.lang.String TAG = "MicroMsg.PhoneBindCardVerifySmsJSHandler";
    public int type;

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public void handle(final com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setDelegate(new com.tencent.kinda.framework.module.impl.KindaJSEvent.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardVerifySmsJSHandler.1
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
                com.tencent.mars.xlog.Log.i("PhoneBindCardVerifySmsJSHandler", "callback: %s", str);
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
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putJSEvent("jsEvent", kindaJSEvent);
        create.putString("notifyType", "fastBindCard");
        create.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, kindaJSInvokeEvent.f54457g.f6765b.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID));
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        create.putString("nonce_str", giVar.f6765b.getString("nonce_str"));
        create.putString("timeStamp", giVar.f6765b.getString("timeStamp"));
        create.putString("package", giVar.f6765b.getString("package"));
        create.putString("paySign", giVar.f6765b.getString("paySign"));
        create.putString("signType", giVar.f6765b.getString("signType"));
        create.putString("sessionid", giVar.f6765b.getString("sessionid"));
        create.putString("jsApiName", giVar.f6766c);
        int i17 = giVar.f6764a;
        if (i17 == 1) {
            create.putInt("jsApiScene", 1);
        } else if (i17 == 0) {
            create.putInt("jsApiScene", 2);
        }
        com.tencent.mars.xlog.Log.i(TAG, "data: %s", giVar.f6765b.toString());
        ((h45.q) i95.n0.c(h45.q.class)).notifyAllUseCase(create);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("jsApiName", giVar.f6766c);
        hashMap.put("notifyType", "fastBindCard");
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, giVar.f6765b.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID));
        hashMap.put("sessionid", giVar.f6765b.getString("sessionid"));
        hashMap.put("nonce_str", giVar.f6765b.getString("nonce_str"));
        hashMap.put("timeStamp", giVar.f6765b.getString("timeStamp"));
        hashMap.put("package", giVar.f6765b.getString("package"));
        hashMap.put("paySign", giVar.f6765b.getString("paySign"));
        hashMap.put("signType", giVar.f6765b.getString("signType"));
        int i18 = giVar.f6764a;
        if (i18 == 1) {
            hashMap.put("jsApiScene", "1");
        } else if (i18 == 0) {
            hashMap.put("jsApiScene", "2");
        }
        com.tencent.kinda.framework.jsapi.WalletJsapiUtil.INSTANCE.doNotifyLiteApp(kindaJSInvokeEvent, LiteAppNotifyName, hashMap);
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public java.lang.String handleJsApi() {
        return com.tencent.mm.plugin.appbrand.jsapi.bb.NAME;
    }

    @Override // com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler
    public int handleType() {
        return this.type;
    }
}
