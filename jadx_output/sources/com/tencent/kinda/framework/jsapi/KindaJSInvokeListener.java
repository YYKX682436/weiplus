package com.tencent.kinda.framework.jsapi;

/* loaded from: classes16.dex */
public class KindaJSInvokeListener extends com.tencent.mm.sdk.event.n {
    private static final java.lang.String TAG = "MicroMsg.KindaJSInvokeListener";

    /* loaded from: classes16.dex */
    public interface JSHandler {
        void handle(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent);

        java.lang.String handleJsApi();

        int handleType();
    }

    public KindaJSInvokeListener() {
        super(0);
    }

    private com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler createHandler(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        if (kindaJSInvokeEvent.f54457g.f6766c.equals(com.tencent.mm.plugin.appbrand.jsapi.bb.NAME)) {
            return new com.tencent.kinda.framework.jsapi.PhoneBindCardVerifySmsJSHandler();
        }
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        if (giVar.f6766c.equals(com.tencent.mm.plugin.appbrand.jsapi.y6.NAME)) {
            return new com.tencent.kinda.framework.jsapi.requestQueryCashierJsHandler();
        }
        if (giVar.f6766c.equals("requestPayAuthen")) {
            return new com.tencent.kinda.framework.jsapi.requestPayAuthenJsHandler();
        }
        if (giVar.f6766c.equals("fastBindCardGetResult")) {
            return new com.tencent.kinda.framework.jsapi.FastBindCardGetResultHandler();
        }
        if (giVar.f6766c.equals(com.tencent.mm.plugin.appbrand.jsapi.za.NAME)) {
            return new com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler();
        }
        if (giVar.f6766c.equals("requestKidsPayRechargePayment")) {
            return new com.tencent.kinda.framework.jsapi.RequestKidsPayRechargePaymentHandler();
        }
        if (giVar.f6766c.equals("requestSnsPayment")) {
            return new com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler();
        }
        if (giVar.f6766c.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.z.NAME)) {
            return new com.tencent.kinda.framework.jsapi.NotifyDcpPaymentCallbackHandler();
        }
        if (giVar.f6766c.equals("notifyWCPayResult")) {
            return new com.tencent.kinda.framework.jsapi.NotifyWCPayResultHandler();
        }
        if (giVar.f6766c.equals("navigateBackToSourceAppForWXPay")) {
            return new com.tencent.kinda.framework.jsapi.NavigateBackToSourceAppForWXPayJSHandler();
        }
        if (giVar.f6766c.equals("getHKCashier")) {
            return new com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler();
        }
        return null;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.autogen.events.KindaJSInvokeEvent kindaJSInvokeEvent) {
        am.gi giVar = kindaJSInvokeEvent.f54457g;
        com.tencent.mars.xlog.Log.i(TAG, "handle jsapi callback: %s, %s", giVar.f6766c, java.lang.Integer.valueOf(giVar.f6764a));
        com.tencent.kinda.framework.jsapi.KindaJSInvokeListener.JSHandler createHandler = createHandler(kindaJSInvokeEvent);
        if (createHandler == null) {
            return false;
        }
        createHandler.handle(kindaJSInvokeEvent);
        return false;
    }
}
