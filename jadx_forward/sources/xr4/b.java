package xr4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f537764d = 0;

    public b(xr4.c cVar, xr4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f537764d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f537764d;
        this.f537764d = i17 + 1;
        if (i17 == 0) {
            return xr4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
