package jz5;

/* loaded from: classes12.dex */
public final class c0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final short[] f384351d;

    /* renamed from: e, reason: collision with root package name */
    public int f384352e;

    public c0(short[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f384351d = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384352e < this.f384351d.length;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384352e;
        short[] sArr = this.f384351d;
        if (i17 >= sArr.length) {
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.f384352e));
        }
        this.f384352e = i17 + 1;
        return new jz5.b0(sArr[i17]);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
