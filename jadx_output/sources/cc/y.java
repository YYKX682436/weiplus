package cc;

/* loaded from: classes3.dex */
public final class y implements java.util.Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
    }
}
