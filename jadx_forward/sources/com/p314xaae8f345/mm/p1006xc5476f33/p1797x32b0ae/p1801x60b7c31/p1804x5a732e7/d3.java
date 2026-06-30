package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class d3 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3 f225082a;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3 h3Var) {
        this.f225082a = h3Var;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject2.getString("type");
            jd.c cVar = this.f225082a.f224975e;
            long j17 = cVar.f380557a;
            long j18 = cVar.f380559c;
            if (!string.equals(ya.b.f77502x92235c1b) && string.equals("liteapp")) {
                java.lang.String[] split = jSONObject2.optString(dm.i4.f66865x76d1ec5a).split("_");
                if (split.length == 2) {
                    j17 = java.lang.Long.parseLong(split[0]);
                    j18 = java.lang.Long.parseLong(split[1]);
                }
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("type", "waapp");
            jSONObject3.put(dm.i4.f66865x76d1ec5a, str);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(ya.b.f77502x92235c1b, jSONObject3);
            jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(j17, j18, "app.postmessage", jSONObject4);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiLaunchMiniProgram", e17.toString());
        }
    }
}
