package b26;

/* loaded from: classes16.dex */
public abstract class b implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f98945a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.h0 f98946b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.v0 f98947c;

    /* renamed from: d, reason: collision with root package name */
    public b26.q f98948d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.w f98949e;

    public b(e26.c0 storageManager, b26.h0 finder, o06.v0 moduleDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleDescriptor, "moduleDescriptor");
        this.f98945a = storageManager;
        this.f98946b = finder;
        this.f98947c = moduleDescriptor;
        this.f98949e = ((e26.u) storageManager).d(new b26.a(this));
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        o26.a.a(packageFragments, ((e26.q) this.f98949e).mo146xb9724478(fqName));
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return kz5.c0.j(((e26.q) this.f98949e).mo146xb9724478(fqName));
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        e26.w wVar = this.f98949e;
        java.lang.Object obj = ((e26.q) wVar).f328561e.get(fqName);
        return (obj != null && obj != e26.s.COMPUTING ? (o06.d1) ((e26.q) wVar).mo146xb9724478(fqName) : d(fqName)) == null;
    }

    public abstract b26.v d(n16.c cVar);

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return kz5.r0.f395535d;
    }
}
