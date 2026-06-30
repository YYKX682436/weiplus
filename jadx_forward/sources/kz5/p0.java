package kz5;

/* loaded from: classes5.dex */
public final class p0 implements java.util.List, java.io.Serializable, java.util.RandomAccess, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final kz5.p0 f395529d = new kz5.p0();

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i17, java.lang.Object obj) {
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
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        java.lang.Void element = (java.lang.Void) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i17 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        java.lang.Void element = (java.lang.Void) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return kz5.o0.f395526d;
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return -1;
        }
        java.lang.Void element = (java.lang.Void) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return kz5.o0.f395526d;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object remove(int i17) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object set(int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        if (i17 == 0 && i18 == 0) {
            return this;
        }
        throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i17 + ", toIndex: " + i18);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    /* renamed from: toString */
    public java.lang.String m144675x9616526c() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        if (i17 == 0) {
            return kz5.o0.f395526d;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17);
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
