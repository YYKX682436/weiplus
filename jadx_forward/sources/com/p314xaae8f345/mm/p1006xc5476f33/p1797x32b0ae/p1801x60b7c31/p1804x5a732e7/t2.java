package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class t2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String optString = jSONObject.optString("chat_username");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(optString)) {
            java.lang.String str2 = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f347362p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            hashMap.put("chat_username", str2);
        } else {
            hashMap.put("chat_username", optString);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 10);
        intent.putExtra("get_msg_proof_items_params", hashMap);
        int i17 = m93.j.f406594u + 1;
        m93.j.f406594u = i17;
        m93.j.f406595v.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406594u);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void m(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            this.f224976f.a("select chat record : cancel");
            return;
        }
        if (intent == null) {
            this.f224976f.a("select chat record : fail");
            return;
        }
        long[] longArrayExtra = intent.getLongArrayExtra("k_outside_expose_proof_item_list");
        java.lang.String stringExtra = intent.getStringExtra("k_username");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        if (longArrayExtra != null) {
            for (long j17 : longArrayExtra) {
                arrayList.add(pt0.f0.Li(stringExtra, j17));
            }
        }
        int size = arrayList.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        java.lang.String[] strArr3 = new java.lang.String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        java.lang.String[] strArr4 = new java.lang.String[size];
        int i19 = 0;
        while (i19 < size) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i19);
            strArr[i19] = java.lang.String.valueOf(f9Var.I0());
            if (intent.getBooleanExtra("k_is_group_chat", z17)) {
                if (f9Var.m78014x7b98c171()) {
                    strArr2[i19] = c01.w9.u(f9Var.J0());
                } else {
                    strArr2[i19] = c01.w9.u(f9Var.j());
                }
                strArr3[i19] = c01.w9.s(f9Var.j());
            } else {
                if (f9Var.m78014x7b98c171()) {
                    strArr2[i19] = f9Var.J0();
                } else {
                    strArr2[i19] = f9Var.j();
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(f9Var.Q0())) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    strArr3[i19] = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.h(f9Var.Q0());
                } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(f9Var.Q0())) {
                    strArr3[i19] = ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(f9Var.Q0());
                } else {
                    strArr3[i19] = f9Var.Q0();
                }
            }
            if (f9Var.A0() == 1) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(f9Var.Q0())) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    strArr3[i19] = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.f(f9Var.Q0());
                } else {
                    strArr3[i19] = c01.z1.r();
                }
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.J4(f9Var.Q0())) {
                if (f9Var.A0() == 1) {
                    strArr3[i19] = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
                } else {
                    strArr3[i19] = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Zi(f9Var.Q0());
                }
            }
            if (strArr2[i19] == null) {
                strArr2[i19] = "";
            }
            if (strArr3[i19] == null) {
                strArr3[i19] = "";
            }
            if (f9Var.k2()) {
                iArr[i19] = 49;
            } else {
                iArr[i19] = f9Var.mo78013xfb85f7b0();
            }
            iArr2[i19] = (int) (f9Var.mo78012x3fdd41df() / 1000);
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null);
            if (d17 != null && d17.get(".msgsource.signature") != null) {
                strArr4[i19] = (java.lang.String) d17.get(".msgsource.signature");
                if (d17.get(".msgsource.realcreatetime") != null) {
                    iArr2[i19] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.realcreatetime"), (int) (f9Var.mo78012x3fdd41df() / 1000));
                }
            }
            i19++;
            z17 = false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i27 = 0; i27 < size; i27++) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("newMsgId", strArr[i27]);
                jSONObject2.put("content", strArr2[i27]);
                jSONObject2.put("sender", strArr3[i27]);
                jSONObject2.put("msgType", iArr[i27]);
                jSONObject2.put("msgTime", iArr2[i27]);
                jSONObject2.put("msgSignature", strArr4[i27]);
                jSONArray.put(jSONObject2);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e17.getMessage());
            }
        }
        try {
            jSONObject.put("result", jSONArray);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e18.getMessage());
        }
        this.f224976f.c(jSONObject, false);
    }
}
