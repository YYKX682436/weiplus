package b26;

/* loaded from: classes16.dex */
public abstract class b implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f17412a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.h0 f17413b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.v0 f17414c;

    /* renamed from: d, reason: collision with root package name */
    public b26.q f17415d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.w f17416e;

    public b(e26.c0 storageManager, b26.h0 finder, o06.v0 moduleDescriptor) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(finder, "finder");
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        this.f17412a = storageManager;
        this.f17413b = finder;
        this.f17414c = moduleDescriptor;
        this.f17416e = ((e26.u) storageManager).d(new b26.a(this));
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(packageFragments, "packageFragments");
        o26.a.a(packageFragments, ((e26.q) this.f17416e).invoke(fqName));
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return kz5.c0.j(((e26.q) this.f17416e).invoke(fqName));
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        e26.w wVar = this.f17416e;
        java.lang.Object obj = ((e26.q) wVar).f247028e.get(fqName);
        return (obj != null && obj != e26.s.COMPUTING ? (o06.d1) ((e26.q) wVar).invoke(fqName) : d(fqName)) == null;
    }

    public abstract b26.v d(n16.c cVar);

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return kz5.r0.f314002d;
    }
}
