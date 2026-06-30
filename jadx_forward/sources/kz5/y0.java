package kz5;

/* loaded from: classes10.dex */
public abstract class y0 implements java.util.Iterator, zz5.a {
    public abstract long b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
