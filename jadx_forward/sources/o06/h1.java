package o06;

/* loaded from: classes15.dex */
public final class h1 implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f423501a;

    public h1(java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        this.f423501a = packageFragments;
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragments, "packageFragments");
        for (java.lang.Object obj : this.f423501a) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.z0) ((o06.d1) obj)).f450099h, fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.Collection collection = this.f423501a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.z0) ((o06.d1) obj)).f450099h, fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.Collection collection = this.f423501a;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.z0) ((o06.d1) it.next())).f450099h, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return q26.h0.y(q26.h0.i(q26.h0.o(kz5.n0.J(this.f423501a), o06.f1.f423489d), new o06.g1(fqName)));
    }
}
