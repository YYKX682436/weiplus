package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private f() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDispatchLiteAppAction", "dispatchLiteAppAction data: %s", c10756x2a5d7b2d.f149939d);
            java.lang.String optString = jSONObject.optString("actionName");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("option");
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            java.lang.String optString2 = optJSONObject.optString("type");
            java.lang.String str = "";
            if (optString2.equals(ya.b.f77502x92235c1b)) {
                str = jSONObject.optString("sourceAppId");
            } else if (optString2.equals("other")) {
                str = optJSONObject.optString("appId");
            }
            if (str.isEmpty()) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("{\"type\": \"error\"}"));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Di(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.e(this, ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).rj(str, optString, optJSONObject2), rVar));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDispatchLiteAppAction", "json exception. error: %s", e17.toString());
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("{\"type\": \"error\"}"));
        }
    }
}
