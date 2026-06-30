package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public class o implements ft.p4 {
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.s sVar) {
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject2.getString("type");
            if (string.equals("liteapp")) {
                java.lang.String optString = jSONObject2.optString(dm.i4.f66865x76d1ec5a);
                java.lang.String[] split = optString.split("_");
                if (split.length == 2) {
                    long parseLong = java.lang.Long.parseLong(split[0]);
                    long parseLong2 = java.lang.Long.parseLong(split[1]);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("type", "waapp");
                    jSONObject3.put(dm.i4.f66865x76d1ec5a, str);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(ya.b.f77502x92235c1b, jSONObject3);
                    jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(parseLong, parseLong2, "app.postmessage", jSONObject4);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenLiteApp", "source id error. sourceId: %s", optString);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenLiteApp", "target type error. type: %s", string);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenLiteApp", "json exception: %s, data: %s", e17.toString(), str2);
        }
    }
}
