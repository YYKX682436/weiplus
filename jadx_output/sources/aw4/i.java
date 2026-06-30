package aw4;

/* loaded from: classes5.dex */
public final class i extends java.util.HashMap {
    public i(org.json.JSONObject jSONObject) {
        put("preInjectData", jSONObject);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj == null ? true : obj instanceof java.lang.String) ? obj2 : super.getOrDefault((java.lang.String) obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return super.remove((java.lang.String) obj, obj2);
        }
        return false;
    }
}
