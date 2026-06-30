package d25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307507d = 0;

    public b(d25.c cVar, d25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307507d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307507d;
        this.f307507d = i17 + 1;
        if (i17 == 0) {
            return d25.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
