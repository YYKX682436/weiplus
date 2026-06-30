package m10;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m10.b f404152a = new m10.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f404153b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f404153b = linkedHashMap;
        linkedHashMap.put("setNirvanaStatusBar", new m10.a(1, "状态栏样式控制兼容低版本crash"));
    }

    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f404153b).entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), ((m10.a) entry.getValue()).f404150a);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
