package y16;

/* loaded from: classes16.dex */
public final class z extends y16.t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f540510f = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y16.z.class), "functions", "getFunctions()Ljava/util/List;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y16.z.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    public final o06.g f540511b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f540512c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f540513d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f540514e;

    public z(e26.c0 storageManager, o06.g containingClass, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingClass, "containingClass");
        this.f540511b = containingClass;
        this.f540512c = z17;
        containingClass.j();
        o06.h hVar = o06.h.f423493d;
        e26.u uVar = (e26.u) storageManager;
        this.f540513d = uVar.b(new y16.x(this));
        this.f540514e = uVar.b(new y16.y(this));
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f540513d, this, f540510f[0]);
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.v) ((o06.v1) obj)).mo132800xfb82e301(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.util.List list = (java.util.List) e26.b0.a(this.f540514e, this, f540510f[1]);
        o26.q qVar = new o26.q();
        for (java.lang.Object obj : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((o06.o1) obj).mo132800xfb82e301(), name)) {
                qVar.add(obj);
            }
        }
        return qVar;
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return null;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        e26.x xVar = this.f540513d;
        f06.v[] vVarArr = f540510f;
        return kz5.n0.t0((java.util.List) e26.b0.a(xVar, this, vVarArr[0]), (java.util.List) e26.b0.a(this.f540514e, this, vVarArr[1]));
    }
}
