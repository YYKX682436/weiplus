package q26;

/* loaded from: classes14.dex */
public final class k0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f441396d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f441397e;

    public k0(q26.l0 l0Var) {
        this.f441396d = l0Var.f441402b;
        this.f441397e = l0Var.f441401a.mo144672x467c086e();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441396d > 0 && this.f441397e.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441396d;
        if (i17 == 0) {
            throw new java.util.NoSuchElementException();
        }
        this.f441396d = i17 - 1;
        return this.f441397e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
