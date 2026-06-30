package a16;

/* loaded from: classes16.dex */
public final class k implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f647a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.a f648b;

    public k(a16.d components) {
        kotlin.jvm.internal.o.g(components, "components");
        a16.l lVar = new a16.l(components, a16.q.f661a, new jz5.c(null));
        this.f647a = lVar;
        e26.u uVar = (e26.u) lVar.f649a.f615a;
        uVar.getClass();
        this.f648b = new e26.g(uVar, new java.util.concurrent.ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(packageFragments, "packageFragments");
        o26.a.a(packageFragments, d(fqName));
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return kz5.c0.j(d(fqName));
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        ((t06.d) this.f647a.f649a.f616b).getClass();
        return false;
    }

    public final b16.i0 d(n16.c fqName) {
        ((t06.d) this.f647a.f649a.f616b).getClass();
        kotlin.jvm.internal.o.g(fqName, "fqName");
        u06.h0 h0Var = new u06.h0(fqName);
        return (b16.i0) ((e26.g) this.f648b).g(fqName, new a16.j(this, h0Var));
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        b16.i0 d17 = d(fqName);
        java.util.List list = d17 != null ? (java.util.List) ((e26.o) d17.f17190q).invoke() : null;
        return list == null ? kz5.p0.f313996d : list;
    }

    public java.lang.String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f647a.f649a.f629o;
    }
}
