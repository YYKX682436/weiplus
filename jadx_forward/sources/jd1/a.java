package jd1;

/* loaded from: classes.dex */
public abstract class a {
    public static final java.util.List a(org.json.JSONArray jSONArray, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = jSONArray.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.lang.Object mo146xb9724478 = transform.mo146xb9724478(obj);
            if (mo146xb9724478 instanceof org.json.JSONObject) {
                mo146xb9724478 = b((org.json.JSONObject) mo146xb9724478, transform);
            } else if (mo146xb9724478 instanceof org.json.JSONArray) {
                mo146xb9724478 = a((org.json.JSONArray) mo146xb9724478, transform);
            }
            arrayList.add(mo146xb9724478);
        }
        return arrayList;
    }

    public static final java.util.Map b(org.json.JSONObject jSONObject, yz5.l transform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transform, "transform");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.lang.Object mo146xb9724478 = transform.mo146xb9724478(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            if (mo146xb9724478 instanceof org.json.JSONObject) {
                mo146xb9724478 = b((org.json.JSONObject) mo146xb9724478, transform);
            } else if (mo146xb9724478 instanceof org.json.JSONArray) {
                mo146xb9724478 = a((org.json.JSONArray) mo146xb9724478, transform);
            }
            hashMap.put(next, mo146xb9724478);
        }
        return hashMap;
    }
}
