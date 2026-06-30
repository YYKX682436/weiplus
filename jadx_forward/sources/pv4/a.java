package pv4;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(org.json.JSONObject jSONObject, yz5.p action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                action.mo149xb9724478(next, optJSONObject);
            }
        }
    }

    public static final java.lang.Integer b(org.json.JSONObject jSONObject, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (jSONObject.has(key)) {
            return java.lang.Integer.valueOf(jSONObject.optInt(key));
        }
        return null;
    }

    public static final java.lang.Long c(org.json.JSONObject jSONObject, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (jSONObject.has(key)) {
            return java.lang.Long.valueOf(jSONObject.optLong(key));
        }
        return null;
    }

    public static final java.lang.String d(org.json.JSONObject jSONObject, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.optString(key);
        }
        return null;
    }

    public static final org.json.JSONArray e(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("String.toJSONArray", "error", e17);
            return null;
        }
    }

    public static final org.json.JSONObject f(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("String.toJSONObject", "error", e17);
            return null;
        }
    }

    public static final java.util.List g(org.json.JSONArray jSONArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                arrayList.add(optJSONObject);
            }
        }
        return arrayList;
    }
}
