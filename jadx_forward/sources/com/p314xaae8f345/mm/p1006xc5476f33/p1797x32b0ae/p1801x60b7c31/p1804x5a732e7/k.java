package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final void A(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("webtype");
        java.lang.String optString2 = jSONObject.optString(dm.i4.f66875xa013b0d5);
        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String optString4 = jSONObject.optString("scenenote");
        java.lang.String optString5 = jSONObject.optString("profileReportInfo");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddContact", "addContact fail, invalid arguments, webType = " + optString + ", username" + optString2);
            this.f224976f.a("addContact: fail");
            return;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(optString, -1);
        if (P == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiAddContact", "addContact fail, parseInt fail, str = ".concat(optString));
            this.f224976f.a("addContact: fail");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddContact", "addContact scene = %s, sceneNote = %s", optString3, optString4);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webtype", optString);
        hashMap.put(dm.i4.f66875xa013b0d5, optString2);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, optString3);
        hashMap.put("addscene", java.lang.String.valueOf(P));
        hashMap.put("scenenote", optString4);
        hashMap.put("profileReportInfo", optString5);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 2);
        int i17 = m93.j.f406578e + 1;
        m93.j.f406578e = i17;
        m93.j.f406579f.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406578e);
        intent.putExtra("add_contact_params", hashMap);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).getClass();
        if (!com.p314xaae8f345.mm.p939x633fb29.p940x30579f.g.a()) {
            A(str, jSONObject, z17);
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("username is null");
            return;
        }
        ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a.BIZ, optString, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j(this, str, jSONObject, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void d(int i17) {
        if (i17 != -2) {
            if (i17 == -1) {
                this.f224976f.a("fail");
                return;
            } else if (i17 == 0) {
                this.f224976f.a("cancel");
                return;
            } else if (i17 != 1) {
                this.f224976f.a("fail");
                return;
            }
        }
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 0;
    }
}
