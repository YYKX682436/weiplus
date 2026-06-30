package lx3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403611d = 0;

    public b(lx3.c cVar, lx3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403611d;
        this.f403611d = i17 + 1;
        if (i17 == 0) {
            return lx3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
