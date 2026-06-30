package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c()) {
            this.f224976f.a("has already bind phone number");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiBindPhone", "bindPhone start");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 17);
        int i17 = m93.j.I + 1;
        m93.j.I = i17;
        m93.j.f406573J.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.I);
        intent.putExtra("bind_phone_direct", true);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBindPhone", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiBindPhone", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void f(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1000) {
            return;
        }
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c()) {
            this.f224976f.d(false);
        } else {
            this.f224976f.a("bind phone fail");
        }
    }
}
