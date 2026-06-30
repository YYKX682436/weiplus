package u1;

/* loaded from: classes13.dex */
public final class r implements java.util.List, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f505195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f505196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.s f505197f;

    public r(u1.s sVar, int i17, int i18) {
        this.f505197f = sVar;
        this.f505195d = i17;
        this.f505196e = i18;
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return this.f505197f.f505198d[i17 + this.f505195d];
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        int i17 = this.f505195d;
        int i18 = this.f505196e;
        if (i17 > i18) {
            return -1;
        }
        int i19 = i17;
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505197f.f505198d[i19], obj)) {
            if (i19 == i18) {
                return -1;
            }
            i19++;
        }
        return i19 - i17;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f505196e - this.f505195d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        int i17 = this.f505195d;
        return new u1.q(this.f505197f, i17, i17, this.f505196e);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int i17 = this.f505196e;
        int i18 = this.f505195d;
        if (i18 > i17) {
            return -1;
        }
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505197f.f505198d[i17], obj)) {
            if (i17 == i18) {
                return -1;
            }
            i17--;
        }
        return i17 - i18;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        int i17 = this.f505195d;
        return new u1.q(this.f505197f, i17, i17, this.f505196e);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f505196e - this.f505195d;
    }

    @Override // java.util.List
    public void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        int i19 = this.f505195d;
        return new u1.r(this.f505197f, i17 + i19, i19 + i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        int i18 = this.f505195d;
        int i19 = this.f505196e;
        return new u1.q(this.f505197f, i17 + i18, i18, i19);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
