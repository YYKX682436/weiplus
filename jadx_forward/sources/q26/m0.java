package q26;

/* loaded from: classes14.dex */
public final class m0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441405d;

    /* renamed from: e, reason: collision with root package name */
    public int f441406e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f441407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.n0 f441408g;

    public m0(q26.n0 n0Var) {
        this.f441408g = n0Var;
        this.f441405d = n0Var.f441409a.mo144672x467c086e();
    }

    public final void b() {
        java.util.Iterator it = this.f441405d;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) this.f441408g.f441410b.mo146xb9724478(next)).booleanValue()) {
                this.f441406e = 1;
                this.f441407f = next;
                return;
            }
        }
        this.f441406e = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f441406e == -1) {
            b();
        }
        return this.f441406e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f441406e == -1) {
            b();
        }
        if (this.f441406e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f441407f;
        this.f441407f = null;
        this.f441406e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
