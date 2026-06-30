package kz5;

/* loaded from: classes5.dex */
public final class p implements java.util.Collection, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f395527d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f395528e;

    public p(java.lang.Object[] values, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        this.f395527d = values;
        this.f395528e = z17;
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return kz5.z.G(this.f395527d, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f395527d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.c.a(this.f395527d);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f395527d.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f395527d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objArr, "<this>");
        if (this.f395528e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(objArr.getClass(), java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
