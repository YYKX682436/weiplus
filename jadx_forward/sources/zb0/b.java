package zb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552770d = 0;

    public b(zb0.c cVar, zb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552770d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552770d;
        this.f552770d = i17 + 1;
        if (i17 == 0) {
            return yb0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
