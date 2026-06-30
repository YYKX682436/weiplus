package my1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final my1.r f414249a = new my1.r();

    public final java.util.Map a(org.json.JSONObject jSONObject) {
        java.lang.Object opt;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (jSONObject == null) {
            return linkedHashMap;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String str = next instanceof java.lang.String ? next : null;
            if (str != null && (opt = jSONObject.opt(str)) != null) {
                if (opt instanceof java.lang.Number) {
                    linkedHashMap.put(str, opt);
                } else if (opt instanceof org.json.JSONArray) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        arrayList.add(a(jSONArray.getJSONObject(i17)));
                    }
                    linkedHashMap.put(str, arrayList);
                } else if (opt instanceof org.json.JSONObject) {
                    linkedHashMap.put(str, a((org.json.JSONObject) opt));
                } else {
                    linkedHashMap.put(str, opt.toString());
                }
            }
        }
        return linkedHashMap;
    }
}
