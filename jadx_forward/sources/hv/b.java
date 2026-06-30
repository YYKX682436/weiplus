package hv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366776d = 0;

    public b(hv.c cVar, hv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366776d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366776d;
        this.f366776d = i17 + 1;
        if (i17 == 0) {
            return gv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
