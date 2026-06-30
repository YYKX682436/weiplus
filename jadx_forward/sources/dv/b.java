package dv;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325324d = 0;

    public b(dv.c cVar, dv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325324d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325324d;
        this.f325324d = i17 + 1;
        if (i17 == 0) {
            return dv.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
