package s1;

/* loaded from: classes13.dex */
public final class m2 implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f483571d;

    public m2(java.util.Set set, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        set = (i17 & 1) != 0 ? new java.util.LinkedHashSet() : set;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        this.f483571d = set;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f483571d.add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f483571d.clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f483571d.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f483571d.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f483571d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f483571d.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.f483571d.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection slotIds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotIds, "slotIds");
        return this.f483571d.remove(slotIds);
    }

    @Override // java.util.Collection
    public boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection slotIds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotIds, "slotIds");
        return this.f483571d.retainAll(slotIds);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f483571d.size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
