package p06;

/* loaded from: classes16.dex */
public final class l implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432299d;

    public l(java.util.List annotations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        this.f432299d = annotations;
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c cVar) {
        return p06.j.a(this, cVar);
    }

    @Override // p06.k
    /* renamed from: isEmpty */
    public boolean mo324x7aab3243() {
        return this.f432299d.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f432299d.iterator();
    }

    /* renamed from: toString */
    public java.lang.String m157639x9616526c() {
        return this.f432299d.toString();
    }
}
