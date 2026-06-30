package u45;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506186d = 0;

    public b(u45.c cVar, u45.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506186d;
        this.f506186d = i17 + 1;
        if (i17 == 0) {
            return va3.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
