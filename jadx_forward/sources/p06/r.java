package p06;

/* loaded from: classes16.dex */
public final class r implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432307d;

    public r(java.util.List delegates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegates, "delegates");
        this.f432307d = delegates;
    }

    @Override // p06.k
    public boolean I(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.Iterator mo144672x467c086e = ((kz5.k0) kz5.n0.J(this.f432307d)).mo144672x467c086e();
        while (mo144672x467c086e.hasNext()) {
            if (((p06.k) mo144672x467c086e.next()).I(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return (p06.c) q26.h0.l(q26.h0.p(kz5.n0.J(this.f432307d), new p06.p(fqName)));
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        java.util.List list = this.f432307d;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((p06.k) it.next()).mo324x7aab3243()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new q26.j((q26.k) q26.h0.m(kz5.n0.J(this.f432307d), p06.q.f432306d));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(p06.k... delegates) {
        this(kz5.z.z0(delegates));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegates, "delegates");
    }
}
