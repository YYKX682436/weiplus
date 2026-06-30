package va0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515753d = 0;

    public b(va0.c cVar, va0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515753d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515753d;
        this.f515753d = i17 + 1;
        if (i17 == 0) {
            return ua0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
