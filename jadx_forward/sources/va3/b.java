package va3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515794d = 0;

    public b(va3.c cVar, va3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515794d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515794d;
        this.f515794d = i17 + 1;
        if (i17 == 0) {
            return va3.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
