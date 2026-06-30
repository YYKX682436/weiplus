package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/v3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class v3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("extInfo");
        boolean z18 = true;
        if (optString == null || optString.length() == 0) {
            this.f224976f.a("extInfo is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
        java.lang.String optString2 = jSONObject2.optString("url");
        if (optString2 != null && optString2.length() != 0) {
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "url is null");
            this.f224976f.a("url is null");
            return;
        }
        int optInt = jSONObject2.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
        c11207x71c7a1c1.f153805d = c();
        c11207x71c7a1c1.f153806e = currentTimeMillis;
        c11207x71c7a1c1.f153807f = optInt;
        r45.s4 s4Var = new r45.s4();
        s4Var.f467019d = optString2;
        r45.l05 l05Var = new r45.l05();
        l05Var.f460594f = optString2;
        l05Var.f460592d = c11207x71c7a1c1.f153807f;
        l05Var.f460593e = jSONObject2.optString("entity", "");
        s4Var.f467022g = l05Var;
        c11207x71c7a1c1.f153810i = s4Var;
        c11207x71c7a1c1.f153809h = j41.f0.a(c11207x71c7a1c1.f153807f);
        r45.g15 g15Var = new r45.g15();
        g15Var.f456338e = jSONObject.optString("sendMessageTitle");
        g15Var.f456339f = jSONObject.optString("sendMessagePath");
        g15Var.f456340g = jSONObject.optString("sendMessageImg");
        g15Var.f456341h = false;
        android.content.Intent intent = new android.content.Intent();
        c11207x71c7a1c1.f153821w = intent;
        android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.ResultReceiverC11209x6faff39d(m77777x504cd8a2, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.u3(this)));
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(c11207x71c7a1c1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat scene: %s, data: %s", java.lang.Integer.valueOf(optInt), jSONObject);
    }
}
