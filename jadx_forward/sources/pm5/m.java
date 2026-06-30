package pm5;

/* loaded from: classes12.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f438442d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.j f438443e;

    /* renamed from: f, reason: collision with root package name */
    public pm5.k f438444f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f438445g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f438446h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f438447i;

    public m(java.util.Iterator it, pm5.j jVar, pm5.k kVar, boolean z17) {
        this.f438442d = it;
        this.f438443e = jVar;
        this.f438444f = kVar;
        this.f438445g = z17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f438447i) {
            return true;
        }
        do {
            java.util.Iterator it = this.f438442d;
            if (!it.hasNext()) {
                pm5.k kVar = this.f438444f;
                if (kVar == null) {
                    return false;
                }
                kVar.e();
                this.f438444f = null;
                return false;
            }
            java.lang.Object d17 = this.f438443e.d(it.next());
            this.f438446h = d17;
            if (d17 != null) {
                break;
            }
        } while (!this.f438445g);
        this.f438447i = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f438447i && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f438446h;
        this.f438446h = null;
        this.f438447i = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
