package a16;

/* loaded from: classes16.dex */
public final class k implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f82180a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.a f82181b;

    public k(a16.d components) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(components, "components");
        a16.l lVar = new a16.l(components, a16.q.f82194a, new jz5.c(null));
        this.f82180a = lVar;
        e26.u uVar = (e26.u) lVar.f82182a.f82148a;
        uVar.getClass();
        this.f82181b = new e26.g(uVar, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        o26.a.a(packageFragments, d(fqName));
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return kz5.c0.j(d(fqName));
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        ((t06.d) this.f82180a.f82182a.f82149b).getClass();
        return false;
    }

    public final b16.i0 d(n16.c fqName) {
        ((t06.d) this.f82180a.f82182a.f82149b).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        u06.h0 h0Var = new u06.h0(fqName);
        return (b16.i0) ((e26.g) this.f82181b).g(fqName, new a16.j(this, h0Var));
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        b16.i0 d17 = d(fqName);
        java.util.List list = d17 != null ? (java.util.List) ((e26.o) d17.f98723q).mo152xb9724478() : null;
        return list == null ? kz5.p0.f395529d : list;
    }

    /* renamed from: toString */
    public java.lang.String m325x9616526c() {
        return "LazyJavaPackageFragmentProvider of module " + this.f82180a.f82182a.f82162o;
    }
}
