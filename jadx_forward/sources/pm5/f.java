package pm5;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f438432d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.d f438433e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f438434f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f438435g;

    public f(java.util.Iterator it, pm5.d dVar) {
        this.f438432d = it;
        this.f438433e = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.lang.Object next;
        if (this.f438435g) {
            return true;
        }
        do {
            java.util.Iterator it = this.f438432d;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
        } while (this.f438433e.b(next));
        this.f438434f = next;
        this.f438435g = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f438435g && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f438434f;
        this.f438434f = null;
        this.f438435g = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
