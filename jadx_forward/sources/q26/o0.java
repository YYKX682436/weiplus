package q26;

/* loaded from: classes8.dex */
public final class o0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441415d;

    /* renamed from: e, reason: collision with root package name */
    public int f441416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.p0 f441417f;

    public o0(q26.p0 p0Var) {
        this.f441417f = p0Var;
        this.f441415d = p0Var.f441418a.mo144672x467c086e();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441415d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        yz5.p pVar = this.f441417f.f441419b;
        int i17 = this.f441416e;
        this.f441416e = i17 + 1;
        if (i17 >= 0) {
            return pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), this.f441415d.next());
        }
        kz5.c0.p();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
