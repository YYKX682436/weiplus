package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class r3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenBizTimelinePublish", "invoke " + jSONObject.toString());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            jSONArray = jSONObject.getJSONArray("localIds");
            if (!jSONObject.has("mpPublishAction")) {
                jSONObject.put("mpPublishAction", 2);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenBizTimelinePublish", e17, "getJSONArray fail", new java.lang.Object[0]);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenBizTimelinePublish", "localIds is null");
        } else {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f224975e.f380557a, jSONArray.optString(i17)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
            }
        }
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(c(), jSONObject, arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.q3(this));
    }
}
