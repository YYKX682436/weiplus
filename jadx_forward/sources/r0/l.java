package r0;

/* loaded from: classes14.dex */
public final class l extends kz5.k {

    /* renamed from: d, reason: collision with root package name */
    public final r0.f f449514d;

    public l(r0.f builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f449514d = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f449514d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f449514d.containsValue(obj);
    }

    @Override // kz5.k
    public int d() {
        r0.f fVar = this.f449514d;
        fVar.getClass();
        return fVar.f449506i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new r0.m(this.f449514d);
    }
}
