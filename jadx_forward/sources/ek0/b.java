package ek0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334935d = 0;

    public b(ek0.c cVar, ek0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334935d;
        this.f334935d = i17 + 1;
        if (i17 == 0) {
            return oy4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
