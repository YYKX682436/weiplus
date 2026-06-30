package jz5;

/* loaded from: classes7.dex */
public final class s implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f384378d;

    /* renamed from: e, reason: collision with root package name */
    public int f384379e;

    public s(byte[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f384378d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384379e < this.f384378d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384379e;
        byte[] bArr = this.f384378d;
        if (i17 >= bArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f384379e));
        }
        this.f384379e = i17 + 1;
        return new jz5.r(bArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
