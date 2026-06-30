package wq5;

/* loaded from: classes8.dex */
public abstract class n {
    public static final void a(org.json.JSONObject jSONObject, java.lang.String key, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        jSONObject.put("__attr__".concat(key), value);
    }

    public static final org.json.JSONArray b(org.json.JSONObject jSONObject, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(key);
        if (optJSONObject != null) {
            org.json.JSONArray put = new org.json.JSONArray().put(optJSONObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(put, "put(...)");
            return put;
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "getJSONArray(...)");
        return jSONArray;
    }
}
