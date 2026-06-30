package g71;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350733d = 0;

    public b(g71.c cVar, g71.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350733d;
        this.f350733d = i17 + 1;
        if (i17 == 0) {
            return g71.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
