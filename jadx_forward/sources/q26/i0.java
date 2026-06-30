package q26;

/* loaded from: classes14.dex */
public final class i0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441383d;

    /* renamed from: e, reason: collision with root package name */
    public int f441384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.j0 f441385f;

    public i0(q26.j0 j0Var) {
        this.f441385f = j0Var;
        this.f441383d = j0Var.f441390a.mo144672x467c086e();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        q26.j0 j0Var;
        java.util.Iterator it;
        while (true) {
            int i17 = this.f441384e;
            j0Var = this.f441385f;
            int i18 = j0Var.f441391b;
            it = this.f441383d;
            if (i17 >= i18 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f441384e++;
        }
        return this.f441384e < j0Var.f441392c && it.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        q26.j0 j0Var;
        java.util.Iterator it;
        while (true) {
            int i17 = this.f441384e;
            j0Var = this.f441385f;
            int i18 = j0Var.f441391b;
            it = this.f441383d;
            if (i17 >= i18 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f441384e++;
        }
        int i19 = this.f441384e;
        if (i19 >= j0Var.f441392c) {
            throw new java.util.NoSuchElementException();
        }
        this.f441384e = i19 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
