package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("card_list");
        java.lang.String optString2 = jSONObject.optString("srcUsername");
        java.lang.String optString3 = jSONObject.optString("url");
        java.lang.String optString4 = jSONObject.optString("consumedCardId");
        java.lang.String optString5 = jSONObject.optString("template_id");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("fail: cardlist is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_list", optString);
        hashMap.put("srcUsername", optString2);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(7));
        hashMap.put("url", optString3);
        hashMap.put("consumedCardId", optString4);
        hashMap.put("template_id", optString5);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 1);
        intent.putExtra("batch_add_card_params", hashMap);
        int i17 = m93.j.f406576c + 1;
        m93.j.f406576c = i17;
        m93.j.f406577d.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406576c);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBatchAddCard", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("card_list");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                hashMap.put("card_list", stringExtra);
            }
            if (i18 == -1) {
                this.f224976f.b(hashMap);
                return;
            }
            if ((intent != null ? intent.getIntExtra("result_code", 2) : 2) == 2) {
                this.f224976f.a("fail");
            } else {
                this.f224976f.a("cancel");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
