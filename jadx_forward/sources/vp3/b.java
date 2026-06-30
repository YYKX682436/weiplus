package vp3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final vp3.b f520501a = new vp3.b();

    public final java.lang.String a() {
        java.util.Map f17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int i17 = 0;
            for (java.util.Map.Entry entry : ((java.util.HashMap) f17).entrySet()) {
                i17 += ((java.lang.Number) entry.getValue()).intValue();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, entry.getKey());
                jSONObject2.put("C", ((java.lang.Number) entry.getValue()).intValue());
                jSONArray.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("total", i17);
            jSONObject3.put("leak", jSONArray);
            jSONObject = jSONObject3;
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.MemoryHookHelper", th6, "", new java.lang.Object[0]);
        }
        try {
            java.lang.String jSONObject4 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return r26.i0.t(jSONObject4, ",", ";", false);
        } catch (java.lang.Throwable th7) {
            oj.j.d("Matrix.Safe", th7, "", new java.lang.Object[0]);
            return "";
        }
    }
}
