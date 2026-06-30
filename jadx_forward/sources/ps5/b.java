package ps5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439689d = 0;

    public b(ps5.c cVar, ps5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439689d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439689d;
        this.f439689d = i17 + 1;
        if (i17 == 0) {
            return yj5.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
