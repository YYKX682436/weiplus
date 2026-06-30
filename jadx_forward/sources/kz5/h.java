package kz5;

/* loaded from: classes5.dex */
public abstract class h extends kz5.b implements java.util.List {

    /* renamed from: d, reason: collision with root package name */
    public static final kz5.d f395506d = new kz5.d(null);

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.Collection other = (java.util.Collection) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (size() == other.size()) {
            java.util.Iterator it = other.iterator();
            java.util.Iterator<E> it6 = iterator();
            while (it6.hasNext()) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it6.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        java.util.Iterator<E> it = iterator();
        int i17 = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i17 = (i17 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i17;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.next(), obj)) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new kz5.e(this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new kz5.f(this, 0);
    }

    @Override // java.util.List
    public java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        return new kz5.g(this, i17, i18);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new kz5.f(this, i17);
    }
}
