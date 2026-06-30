package va;

/* loaded from: classes16.dex */
public final class u extends java.util.AbstractCollection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va.z f515738d;

    public u(va.z zVar) {
        this.f515738d = zVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f515738d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f515738d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f515738d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new va.t(this.f515738d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f515738d.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
        return va.z.a(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return va.z.a(this).toArray(objArr);
    }
}
