package p06;

/* loaded from: classes16.dex */
public final class s implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final p06.k f432308d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f432309e;

    public s(p06.k delegate, yz5.l fqNameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqNameFilter, "fqNameFilter");
        this.f432308d = delegate;
        this.f432309e = fqNameFilter;
    }

    @Override // p06.k
    public boolean I(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        if (((java.lang.Boolean) this.f432309e.mo146xb9724478(fqName)).booleanValue()) {
            return this.f432308d.I(fqName);
        }
        return false;
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        if (((java.lang.Boolean) this.f432309e.mo146xb9724478(fqName)).booleanValue()) {
            return this.f432308d.a(fqName);
        }
        return null;
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        p06.k kVar = this.f432308d;
        if ((kVar instanceof java.util.Collection) && ((java.util.Collection) kVar).isEmpty()) {
            return false;
        }
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            n16.c a17 = ((p06.c) it.next()).a();
            if (a17 != null && ((java.lang.Boolean) this.f432309e.mo146xb9724478(a17)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f432308d) {
            n16.c a17 = ((p06.c) obj).a();
            if (a17 != null && ((java.lang.Boolean) this.f432309e.mo146xb9724478(a17)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
