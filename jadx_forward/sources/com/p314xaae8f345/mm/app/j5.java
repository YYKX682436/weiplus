package com.p314xaae8f345.mm.app;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.j5 f134996a = new com.p314xaae8f345.mm.app.j5();

    public final org.json.JSONObject a(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, entry.getKey());
                jSONObject2.put("C", ((java.lang.Number) entry.getValue()).intValue());
                jSONArray.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("total", i17);
            jSONObject3.put("leak", jSONArray);
            return jSONObject3;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.OOMReporter", th6, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }
}
