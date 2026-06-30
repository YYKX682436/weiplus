package l26;

/* loaded from: classes14.dex */
public final class b0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f396749d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l26.c0 f396750e;

    public b0(l26.c0 c0Var) {
        this.f396750e = c0Var;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f396749d;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f396749d) {
            throw new java.util.NoSuchElementException();
        }
        this.f396749d = false;
        return this.f396750e.f396751d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
