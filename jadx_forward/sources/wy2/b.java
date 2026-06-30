package wy2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532165d = 0;

    public b(wy2.c cVar, wy2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532165d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532165d;
        this.f532165d = i17 + 1;
        if (i17 == 0) {
            return wy2.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
