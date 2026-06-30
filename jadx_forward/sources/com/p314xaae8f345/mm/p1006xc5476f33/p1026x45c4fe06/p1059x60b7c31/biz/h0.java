package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes.dex */
public final class h0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.h0 f161497a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.h0();

    @Override // nf.j
    /* renamed from: onResult */
    public final void mo14598x57429edc(int i17, android.content.Intent intent) {
        if (intent == null || i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent " + intent);
        java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
        java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
        boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "dealSendCardEvent " + stringExtra + ", " + stringExtra2 + ", " + booleanExtra + ", " + stringExtra3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("be_send_card_name", stringExtra);
        bundle.putString("received_card_name", stringExtra2);
        bundle.putBoolean("Is_Chatroom", booleanExtra);
        bundle.putString("custom_send_text", stringExtra3);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.c0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.g0.f161495d);
    }
}
