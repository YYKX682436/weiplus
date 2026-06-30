package n0;

/* loaded from: classes14.dex */
public final class g2 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final n0.k4 f415044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415045e;

    /* renamed from: f, reason: collision with root package name */
    public int f415046f;

    /* renamed from: g, reason: collision with root package name */
    public final int f415047g;

    public g2(n0.k4 table, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        this.f415044d = table;
        this.f415045e = i18;
        this.f415046f = i17;
        this.f415047g = table.f415129m;
        if (table.f415128i) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void b() {
        if (this.f415044d.f415129m != this.f415047g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415046f < this.f415045e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f415046f;
        this.f415046f = n0.l4.c(this.f415044d.f415123d, i17) + i17;
        return new n0.f2(this, i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
