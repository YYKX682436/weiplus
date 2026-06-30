package ds3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324448d = 0;

    public b(ds3.c cVar, ds3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324448d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324448d;
        this.f324448d = i17 + 1;
        if (i17 == 0) {
            return ds3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
