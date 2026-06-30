package ax4;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15127a = 0;

    static {
        new java.util.ArrayList().add("updatePageAuth");
        new java.util.ArrayList();
    }

    public static void a(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((key instanceof java.lang.String) && (value instanceof java.util.Map)) {
                java.util.Map map2 = (java.util.Map) value;
                a(map2);
                map.put(key, new org.json.JSONObject(map2));
            }
        }
    }
}
