package u06;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final u06.f f505032a = new u06.f();

    /* renamed from: b, reason: collision with root package name */
    public static u06.e f505033b;

    public final u06.e a(java.lang.reflect.Member member) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
        java.lang.Class<?> cls = member.getClass();
        try {
            return new u06.e(cls.getMethod("getParameters", new java.lang.Class[0]), u06.i.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException unused) {
            return new u06.e(null, null);
        }
    }
}
