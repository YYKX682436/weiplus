package q26;

/* loaded from: classes14.dex */
public final class d implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f441366d;

    /* renamed from: e, reason: collision with root package name */
    public int f441367e;

    public d(q26.e eVar) {
        this.f441366d = eVar.f441369a.mo144672x467c086e();
        this.f441367e = eVar.f441370b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            int i17 = this.f441367e;
            it = this.f441366d;
            if (i17 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f441367e--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Iterator it;
        while (true) {
            int i17 = this.f441367e;
            it = this.f441366d;
            if (i17 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f441367e--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
