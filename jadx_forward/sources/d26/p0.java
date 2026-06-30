package d26;

/* loaded from: classes16.dex */
public final class p0 extends r06.l implements d26.a0 {

    /* renamed from: o, reason: collision with root package name */
    public final i16.o1 f307569o;

    /* renamed from: p, reason: collision with root package name */
    public final k16.g f307570p;

    /* renamed from: q, reason: collision with root package name */
    public final k16.k f307571q;

    /* renamed from: r, reason: collision with root package name */
    public final k16.m f307572r;

    /* renamed from: s, reason: collision with root package name */
    public final d26.z f307573s;

    /* renamed from: t, reason: collision with root package name */
    public f26.z0 f307574t;

    /* renamed from: u, reason: collision with root package name */
    public f26.z0 f307575u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f307576v;

    /* renamed from: w, reason: collision with root package name */
    public f26.z0 f307577w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e26.c0 storageManager, o06.m containingDeclaration, p06.k annotations, n16.g name, o06.g0 visibility, i16.o1 proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar) {
        super(storageManager, containingDeclaration, annotations, name, o06.x1.f423537a, visibility);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "visibility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        this.f307569o = proto;
        this.f307570p = nameResolver;
        this.f307571q = typeTable;
        this.f307572r = versionRequirementTable;
        this.f307573s = zVar;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.f307570p;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.f307573s;
    }

    @Override // o06.a2
    public o06.n d(f26.v2 substitutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(substitutor, "substitutor");
        if (substitutor.h()) {
            return this;
        }
        e26.c0 c0Var = this.f450012h;
        o06.m e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
        p06.k mo9601xa083c1ee = mo9601xa083c1ee();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9601xa083c1ee, "<get-annotations>(...)");
        n16.g mo132800xfb82e301 = mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        d26.p0 p0Var = new d26.p0(c0Var, e17, mo9601xa083c1ee, mo132800xfb82e301, this.f450013i, this.f307569o, this.f307570p, this.f307571q, this.f307572r, this.f307573s);
        java.util.List m17 = m();
        f26.z0 v07 = v0();
        f26.d3 d3Var = f26.d3.f340676f;
        f26.o0 i17 = substitutor.i(v07, d3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "safeSubstitute(...)");
        f26.z0 a17 = f26.r2.a(i17);
        f26.o0 i18 = substitutor.i(u0(), d3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "safeSubstitute(...)");
        p0Var.w0(m17, a17, f26.r2.a(i18));
        return p0Var;
    }

    @Override // o06.j
    public f26.z0 k() {
        f26.z0 z0Var = this.f307577w;
        if (z0Var != null) {
            return z0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("defaultTypeImpl");
        throw null;
    }

    public o06.g s0() {
        if (f26.s0.a(u0())) {
            return null;
        }
        o06.j i17 = u0().w0().i();
        if (i17 instanceof o06.g) {
            return (o06.g) i17;
        }
        return null;
    }

    @Override // d26.a0
    public k16.k t() {
        return this.f307571q;
    }

    public f26.z0 u0() {
        f26.z0 z0Var = this.f307575u;
        if (z0Var != null) {
            return z0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("expandedType");
        throw null;
    }

    public f26.z0 v0() {
        f26.z0 z0Var = this.f307574t;
        if (z0Var != null) {
            return z0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("underlyingType");
        throw null;
    }

    public final void w0(java.util.List declaredTypeParameters, f26.z0 underlyingType, f26.z0 expandedType) {
        y16.s sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(declaredTypeParameters, "declaredTypeParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(underlyingType, "underlyingType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandedType, "expandedType");
        this.f450014m = declaredTypeParameters;
        this.f307574t = underlyingType;
        this.f307575u = expandedType;
        this.f307576v = o06.i2.b(this);
        o06.g s07 = s0();
        if (s07 == null || (sVar = s07.A()) == null) {
            sVar = y16.r.f540506b;
        }
        this.f307577w = f26.z2.n(this, sVar, new r06.h(this));
    }
}
