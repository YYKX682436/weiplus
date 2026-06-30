package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("tousername");
        java.lang.String optString2 = jSONObject.optString("extmsg");
        java.lang.String uj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("fail: username is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tousername", optString);
        hashMap.put("extmsg", optString2);
        hashMap.put("url", uj6);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 3);
        intent.putExtra("jump_to_biz_profile_params", hashMap);
        int i17 = m93.j.f406580g + 1;
        m93.j.f406580g = i17;
        m93.j.f406581h.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406580g);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiJumpToBizProfile", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void n(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3) {
            if (i18 == -1) {
                this.f224976f.d(false);
                return;
            }
            if (i18 == 0) {
                this.f224976f.a("canceled");
            } else if (i18 == 2 || i18 == 3) {
                this.f224976f.a("check_fail");
            } else {
                this.f224976f.a("fail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiJumpToBizProfile", "unknown resultCode");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
