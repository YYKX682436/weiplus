package n43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416436d = 0;

    public b(n43.c cVar, n43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416436d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416436d;
        this.f416436d = i17 + 1;
        if (i17 == 0) {
            return yz4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
