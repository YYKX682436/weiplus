package fz4;

/* loaded from: classes5.dex */
public final class p implements java.util.Set, zz5.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f348863d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f348864e = new java.util.LinkedHashSet();

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        return this.f348864e.add(new java.lang.ref.WeakReference(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f348863d.addAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f348864e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f348863d.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f348863d.containsAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f348863d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        java.util.Set set = this.f348864e;
        set.removeIf(fz4.n.f348861a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((java.lang.ref.WeakReference) it.next()).get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return kz5.n0.W0(arrayList).iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.f348864e.removeIf(new fz4.o(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f348863d.removeAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f348863d.retainAll(elements);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        java.util.Set set = this.f348864e;
        set.removeIf(fz4.n.f348861a);
        return set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
