package rg0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476694d = 0;

    public b(rg0.c cVar, rg0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476694d;
        this.f476694d = i17 + 1;
        if (i17 == 0) {
            return rg0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
