package q26;

/* loaded from: classes5.dex */
public final class h implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441376d;

    /* renamed from: e, reason: collision with root package name */
    public int f441377e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f441378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.i f441379g;

    public h(q26.i iVar) {
        this.f441379g = iVar;
        this.f441376d = iVar.f441380a.mo144672x467c086e();
    }

    public final void b() {
        java.lang.Object next;
        q26.i iVar;
        do {
            java.util.Iterator it = this.f441376d;
            if (!it.hasNext()) {
                this.f441377e = 0;
                return;
            } else {
                next = it.next();
                iVar = this.f441379g;
            }
        } while (((java.lang.Boolean) iVar.f441382c.mo146xb9724478(next)).booleanValue() != iVar.f441381b);
        this.f441378f = next;
        this.f441377e = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f441377e == -1) {
            b();
        }
        return this.f441377e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f441377e == -1) {
            b();
        }
        if (this.f441377e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f441378f;
        this.f441378f = null;
        this.f441377e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
