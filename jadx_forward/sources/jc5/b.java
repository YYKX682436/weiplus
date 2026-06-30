package jc5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final jc5.b f380549a = new jc5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f380550b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f380551c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f380552d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f380553e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static long f380554f;

    /* renamed from: g, reason: collision with root package name */
    public static int f380555g;

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String b17 = b(msg);
        if (b17.length() == 0) {
            return;
        }
        java.util.Map map = f380550b;
        java.lang.String Q0 = msg.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(Q0);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(Q0, obj);
        }
        java.util.List list = (java.util.List) obj;
        if (list.contains(b17)) {
            return;
        }
        list.add(b17);
    }

    public final java.lang.String b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        if (f9Var == null) {
            return "";
        }
        java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) f380551c).get(f9Var.Q0());
        if (map == null || (str = (java.lang.String) map.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) == null) {
            return "";
        }
        if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "NoneId"))) {
            str = null;
        }
        return str == null ? "" : str;
    }
}
