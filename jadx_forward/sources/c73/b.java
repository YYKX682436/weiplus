package c73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f121139d = 0;

    public b(c73.c cVar, c73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f121139d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f121139d;
        this.f121139d = i17 + 1;
        if (i17 == 0) {
            return c73.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
