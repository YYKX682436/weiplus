package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        if (optString.length() > 1024) {
            optString.substring(0, 1024);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiEnterContact", "enterContact sessionFrom length is large than 1024!");
        }
        java.lang.String optString2 = jSONObject.optString("appId");
        java.lang.String optString3 = jSONObject.optString("userName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            this.f224976f.a("expected necessary param");
            return;
        }
        jSONObject.optString("businessId");
        jSONObject.optBoolean("showMessageCard", false);
        jSONObject.optString("sendMessageTitle");
        jSONObject.optString("sendMessagePath");
        jSONObject.optString("sendMessageImg");
        jSONObject.optString("headimgUrl");
        jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        jSONObject.optString("subTitle");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, optString3, null, optString2, 2, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.h2$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j6
            /* renamed from: onResult */
            public final void mo52612x57429edc(int i17, java.lang.String str2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h2.this;
                h2Var.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("retCode", java.lang.Integer.valueOf(i17));
                hashMap.put("errMsg", str2);
                h2Var.f224976f.b(hashMap);
            }
        });
    }
}
