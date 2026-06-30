package com.tencent.mm.app;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.app.j5 f53463a = new com.tencent.mm.app.j5();

    public final org.json.JSONObject a(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : map.entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, entry.getKey());
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
