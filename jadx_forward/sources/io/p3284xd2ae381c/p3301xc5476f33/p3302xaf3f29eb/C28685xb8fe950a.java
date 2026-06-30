package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.JSONUtil */
/* loaded from: classes13.dex */
public class C28685xb8fe950a {
    private C28685xb8fe950a() {
    }

    /* renamed from: unwrap */
    public static java.lang.Object m138431xcdecea63(java.lang.Object obj) {
        if (org.json.JSONObject.NULL.equals(obj) || obj == null) {
            return null;
        }
        if ((obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.String)) {
            return obj;
        }
        if (obj instanceof org.json.JSONArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(m138431xcdecea63(jSONArray.get(i17)));
            }
            return arrayList;
        }
        if (obj instanceof org.json.JSONObject) {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, m138431xcdecea63(jSONObject.get(next)));
            }
            return hashMap;
        }
        return null;
    }

    /* renamed from: wrap */
    public static java.lang.Object m138432x37d04a(java.lang.Object obj) {
        if (obj == null) {
            return org.json.JSONObject.NULL;
        }
        if ((obj instanceof org.json.JSONArray) || (obj instanceof org.json.JSONObject) || obj.equals(org.json.JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof java.util.Collection) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(m138432x37d04a(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            int length = java.lang.reflect.Array.getLength(obj);
            for (int i17 = 0; i17 < length; i17++) {
                jSONArray2.put(m138432x37d04a(java.lang.reflect.Array.get(obj, i17)));
            }
            return jSONArray2;
        }
        if (obj instanceof java.util.Map) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), m138432x37d04a(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }
}
