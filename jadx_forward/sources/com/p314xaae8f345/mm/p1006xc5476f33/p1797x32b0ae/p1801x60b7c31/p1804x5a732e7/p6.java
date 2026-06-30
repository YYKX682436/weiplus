package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class p6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 11);
        int i17 = m93.j.f406596w + 1;
        m93.j.f406596w = i17;
        m93.j.f406597x.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406596w);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSelectBank", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void w(int i17, int i18, android.content.Intent intent) {
        if (intent == null) {
            this.f224976f.a("cancel");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("bank_name");
        java.lang.String stringExtra2 = intent.getStringExtra("bank_icon");
        java.lang.String stringExtra3 = intent.getStringExtra("bank_type");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bankType", stringExtra3);
        hashMap.put("bankName", stringExtra);
        hashMap.put("bankIcon", stringExtra2);
        this.f224976f.b(hashMap);
    }
}
