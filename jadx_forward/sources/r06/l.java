package r06;

/* loaded from: classes16.dex */
public abstract class l extends r06.w implements o06.d2 {

    /* renamed from: h, reason: collision with root package name */
    public final e26.c0 f450012h;

    /* renamed from: i, reason: collision with root package name */
    public final o06.g0 f450013i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f450014m;

    /* renamed from: n, reason: collision with root package name */
    public final r06.k f450015n;

    static {
        p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r06.l.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e26.c0 storageManager, o06.m containingDeclaration, p06.k annotations, n16.g name, o06.x1 sourceElement, o06.g0 visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceElement, "sourceElement");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityImpl, "visibilityImpl");
        this.f450012h = storageManager;
        this.f450013i = visibilityImpl;
        ((e26.u) storageManager).b(new r06.i(this));
        this.f450015n = new r06.k(this);
    }

    @Override // r06.w, r06.v, o06.m
    public o06.j a() {
        return this;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f450015n;
    }

    @Override // o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        return this.f450013i;
    }

    @Override // o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return false;
    }

    @Override // r06.w
    /* renamed from: j0 */
    public o06.p a() {
        return this;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.k
    public java.util.List m() {
        java.util.List list = this.f450014m;
        if (list != null) {
            return list;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("declaredTypeParametersImpl");
        throw null;
    }

    @Override // o06.k
    public boolean p() {
        return f26.z2.c(((d26.p0) this).v0(), new r06.j(this));
    }

    @Override // r06.v
    /* renamed from: toString */
    public java.lang.String mo9603x9616526c() {
        return "typealias " + mo132800xfb82e301().h();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return visitor.c(this, obj);
    }

    @Override // r06.w, r06.v, o06.m
    public o06.m a() {
        return this;
    }
}
