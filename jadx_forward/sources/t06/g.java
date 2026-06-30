package t06;

/* loaded from: classes15.dex */
public final class g implements g16.q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t06.f f496068c = new t06.f(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f496069a;

    /* renamed from: b, reason: collision with root package name */
    public final h16.c f496070b;

    public g(java.lang.Class cls, h16.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f496069a = cls;
        this.f496070b = cVar;
    }

    public n16.b a() {
        return u06.i.a(this.f496069a);
    }

    public java.lang.String b() {
        return r26.i0.u(this.f496069a.getName(), '.', '/', false, 4, null).concat(".class");
    }

    /* renamed from: equals */
    public boolean m165596xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof t06.g) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496069a, ((t06.g) obj).f496069a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m165597x8cdac1b() {
        return this.f496069a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165598x9616526c() {
        return t06.g.class.getName() + ": " + this.f496069a;
    }
}
