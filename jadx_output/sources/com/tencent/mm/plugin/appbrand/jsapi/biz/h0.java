package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes.dex */
public final class h0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.biz.h0 f79964a = new com.tencent.mm.plugin.appbrand.jsapi.biz.h0();

    @Override // nf.j
    public final void onResult(int i17, android.content.Intent intent) {
        if (intent == null || i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent " + intent);
        java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
        java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent " + stringExtra + ", " + stringExtra2 + ", " + booleanExtra + ", " + stringExtra3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("be_send_card_name", stringExtra);
        bundle.putString("received_card_name", stringExtra2);
        bundle.putBoolean("Is_Chatroom", booleanExtra);
        bundle.putString("custom_send_text", stringExtra3);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, com.tencent.mm.plugin.appbrand.jsapi.biz.c0.class, com.tencent.mm.plugin.appbrand.jsapi.biz.g0.f79962d);
    }
}
