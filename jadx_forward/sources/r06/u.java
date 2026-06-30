package r06;

/* loaded from: classes15.dex */
public final class u implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f450068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f450069b;

    public u(java.util.List providers, java.lang.String debugName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(providers, "providers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugName, "debugName");
        this.f450068a = providers;
        this.f450069b = debugName;
        providers.size();
        kz5.n0.X0(providers).size();
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        java.util.Iterator it = this.f450068a.iterator();
        while (it.hasNext()) {
            o06.i1.a((o06.e1) it.next(), fqName, packageFragments);
        }
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f450068a.iterator();
        while (it.hasNext()) {
            o06.i1.a((o06.e1) it.next(), fqName, arrayList);
        }
        return kz5.n0.S0(arrayList);
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.List list = this.f450068a;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!o06.i1.b((o06.e1) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f450068a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((o06.e1) it.next()).l(fqName, nameFilter));
        }
        return hashSet;
    }

    /* renamed from: toString */
    public java.lang.String m161261x9616526c() {
        return this.f450069b;
    }
}
