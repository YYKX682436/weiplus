package n0;

/* loaded from: classes14.dex */
public final class q1 implements java.lang.Iterable, java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final n0.k4 f415215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415216e;

    /* renamed from: f, reason: collision with root package name */
    public int f415217f;

    public q1(n0.k4 table, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        this.f415215d = table;
        int b17 = n0.l4.b(table.f415123d, i17);
        int i18 = i17 + 1;
        this.f415216e = i18 < table.f415124e ? n0.l4.b(table.f415123d, i18) : table.f415126g;
        this.f415217f = b17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415217f < this.f415216e;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj;
        int i17 = this.f415217f;
        if (i17 >= 0) {
            java.lang.Object[] objArr = this.f415215d.f415125f;
            if (i17 < objArr.length) {
                obj = objArr[i17];
                this.f415217f = i17 + 1;
                return obj;
            }
        }
        obj = null;
        this.f415217f = i17 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
