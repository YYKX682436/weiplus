package hc2;

/* loaded from: classes.dex */
public abstract class k {
    public static final java.lang.String a(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", e17.getMessage());
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
