package jz5;

/* loaded from: classes8.dex */
public final class v implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f384382d;

    /* renamed from: e, reason: collision with root package name */
    public int f384383e;

    public v(int[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f384382d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384383e < this.f384382d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384383e;
        int[] iArr = this.f384382d;
        if (i17 >= iArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f384383e));
        }
        this.f384383e = i17 + 1;
        return new jz5.u(iArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
