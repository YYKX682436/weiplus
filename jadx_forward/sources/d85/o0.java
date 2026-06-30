package d85;

/* loaded from: classes5.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f308762a = new java.util.HashMap();

    static {
        d85.i1 i1Var = d85.i1.f308739a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject(i1Var.a(context, "methodToPermissionMap.json"));
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String obj = jSONArray.get(i17).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                f308762a.put(obj, next);
            }
        }
    }
}
