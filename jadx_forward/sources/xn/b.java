package xn;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final xn.a f536934c = new xn.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f536935a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f536936b = new java.util.LinkedHashMap();

    public b() {
        a45.g gVar = (a45.g) this;
        try {
            gVar.a(1000000, 0, a45.b.class);
            gVar.a(1, 0, a45.k.class);
            gVar.a(43, 0, a45.m.class);
            gVar.a(3, 0, a45.c.class);
            gVar.a(49, 6, a45.a.class);
            gVar.a(49, 130, a45.a.class);
            gVar.f536936b.put(49, a45.d.f82881d);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void a(int i17, int i18, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f536935a.put(java.lang.Integer.valueOf(f536934c.a("", i17, i18)), clazz);
    }
}
