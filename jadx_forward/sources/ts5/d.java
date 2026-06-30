package ts5;

/* loaded from: classes3.dex */
public interface d {
    void a(java.util.Map map);

    default void b(org.json.JSONObject json, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if ((((java.lang.CharSequence) entry.getKey()).length() > 0) && ((entry.getValue() instanceof java.lang.Number) || (entry.getValue() instanceof java.lang.String) || (entry.getValue() instanceof java.lang.Boolean) || (entry.getValue() instanceof org.json.JSONObject) || (entry.getValue() instanceof java.lang.Float) || (entry.getValue() instanceof org.json.JSONArray))) {
                    json.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: cancel */
    void mo149995xae7a2e7a();

    /* renamed from: start */
    void mo149996x68ac462();
}
