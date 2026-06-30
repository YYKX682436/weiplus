package gi4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353820d = 0;

    public b(gi4.c cVar, gi4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353820d;
        this.f353820d = i17 + 1;
        if (i17 == 0) {
            return gi4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
