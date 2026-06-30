package l03;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final l03.a f396379a = new l03.a();

    public final java.util.Map a(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return kz5.q0.f395534d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if ((key instanceof java.lang.String) && value != null) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }
}
