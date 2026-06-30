package h2;

/* loaded from: classes13.dex */
public final class d implements java.util.Collection, zz5.a {

    /* renamed from: f, reason: collision with root package name */
    public static final h2.c f359791f = new h2.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f359792d;

    /* renamed from: e, reason: collision with root package name */
    public final int f359793e;

    public d(java.util.List localeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localeList, "localeList");
        this.f359792d = localeList;
        this.f359793e = localeList.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
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
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof h2.b)) {
            return false;
        }
        h2.b element = (h2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return this.f359792d.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return this.f359792d.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h2.d) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f359792d, ((h2.d) obj).f359792d);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f359792d.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f359792d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f359792d.iterator();
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
    public boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f359793e;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.a(this);
    }

    /* renamed from: toString */
    public java.lang.String m132779x9616526c() {
        return "LocaleList(localeList=" + this.f359792d + ')';
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        return p3321xbce91901.jvm.p3324x21ffc6bd.h.b(this, array);
    }
}
