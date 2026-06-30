package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class f7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225112g = "";

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        boolean z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendTextMessage", "invoke sendTextMessage, appId=%s, data=%s", str, jSONObject);
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSendTextMessage", "sendTextMessage fail, text is empty");
            this.f224976f.a("text is empty");
            return;
        }
        this.f225112g = optString;
        android.content.Context c17 = c();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, optString);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("callback_id", m93.j.a(this));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extra");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("isRecentForward");
            java.lang.String optString2 = optJSONObject.optString("content");
            int optInt = optJSONObject.optInt(ya.b.f77479x42930b2);
            if (optBoolean) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 12L, 1L, false);
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                java.util.ArrayList Ui = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Ui();
                if (!Ui.isEmpty()) {
                    for (int i17 = 0; i17 < Ui.size(); i17++) {
                        o25.m2 m2Var = (o25.m2) Ui.get(i17);
                        if (optInt == i17 && optString2.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m2Var.f424093a))) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 13L, 1L, false);
                            z18 = true;
                            str2 = m2Var.f424093a;
                            break;
                        }
                    }
                }
            }
        }
        str2 = "";
        z18 = false;
        hashMap.put("isText", "true");
        if (z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendTextMessage", "startActivity intent=%s", intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendTextMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendTextMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendTextMessage", "onSelectConversationUICallback requestCode=%d, resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1 || intent == null) {
            this.f224976f.a("cancel");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && !android.text.TextUtils.isEmpty(this.f225112g)) {
            ((dk5.s5) tg3.t1.a()).fj(stringExtra, this.f225112g, c01.e2.C(stringExtra), 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().g(stringExtra);
        }
        this.f224976f.d(false);
    }
}
