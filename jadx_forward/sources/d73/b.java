package d73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308416d = 0;

    public b(d73.c cVar, d73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308416d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308416d;
        this.f308416d = i17 + 1;
        if (i17 == 0) {
            return g73.s0.INSTANCE;
        }
        if (i17 == 1) {
            return g73.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
