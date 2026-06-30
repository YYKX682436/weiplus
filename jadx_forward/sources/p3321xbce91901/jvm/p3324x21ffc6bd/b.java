package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes5.dex */
public final class b implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f391642d;

    /* renamed from: e, reason: collision with root package name */
    public int f391643e;

    public b(java.lang.Object[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f391642d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f391643e < this.f391642d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        try {
            java.lang.Object[] objArr = this.f391642d;
            int i17 = this.f391643e;
            this.f391643e = i17 + 1;
            return objArr[i17];
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            this.f391643e--;
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
