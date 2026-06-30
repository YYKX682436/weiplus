package h26;

/* loaded from: classes16.dex */
public final class f implements o06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h26.f f359863d = new h26.f();

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f359864e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f359865f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f359866g;

    static {
        h26.b[] bVarArr = h26.b.f359860d;
        f359864e = n16.g.m("<Error module>");
        f359865f = kz5.p0.f395529d;
        f359866g = jz5.h.b(h26.e.f359862d);
    }

    @Override // o06.v0
    public java.lang.Object I(o06.u0 capability) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(capability, "capability");
        return null;
    }

    @Override // o06.v0
    public java.util.List K() {
        return f359865f;
    }

    @Override // o06.v0
    public o06.k1 Q(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    @Override // o06.m
    public o06.m a() {
        return this;
    }

    @Override // o06.v0
    public boolean b0(o06.v0 targetModule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetModule, "targetModule");
        return false;
    }

    @Override // o06.m
    public o06.m e() {
        return null;
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        int i17 = p06.k.Z0;
        return p06.i.f432298a;
    }

    @Override // o06.x0
    /* renamed from: getName */
    public n16.g mo132800xfb82e301() {
        return f359864e;
    }

    @Override // o06.v0
    public l06.o h() {
        return (l06.o) ((jz5.n) f359866g).mo141623x754a37bb();
    }

    @Override // o06.v0
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return kz5.p0.f395529d;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return null;
    }
}
