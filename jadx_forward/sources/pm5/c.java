package pm5;

/* loaded from: classes12.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f438425d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.a f438426e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f438427f = java.util.Collections.emptyList().iterator();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f438428g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438429h;

    public c(java.util.Iterator it, pm5.a aVar) {
        this.f438425d = it;
        this.f438426e = aVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f438429h) {
            return true;
        }
        if (this.f438427f == null) {
            return false;
        }
        while (!this.f438427f.hasNext()) {
            this.f438428g = null;
            this.f438427f = null;
            java.util.Iterator it = this.f438425d;
            if (!it.hasNext()) {
                return false;
            }
            java.lang.Iterable a17 = this.f438426e.a(it.next());
            this.f438427f = a17 != null ? a17.iterator() : java.util.Collections.emptyList().iterator();
        }
        this.f438428g = this.f438427f.next();
        this.f438429h = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f438429h && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f438428g;
        this.f438428g = null;
        this.f438429h = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
