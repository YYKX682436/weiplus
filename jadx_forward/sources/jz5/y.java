package jz5;

/* loaded from: classes10.dex */
public final class y implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f384386d;

    /* renamed from: e, reason: collision with root package name */
    public int f384387e;

    public y(long[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f384386d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384387e < this.f384386d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384387e;
        long[] jArr = this.f384386d;
        if (i17 >= jArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f384387e));
        }
        this.f384387e = i17 + 1;
        return new jz5.x(jArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
