package xs;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f537773d = 0;

    public b(xs.c cVar, xs.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f537773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f537773d;
        this.f537773d = i17 + 1;
        if (i17 == 0) {
            return a80.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
