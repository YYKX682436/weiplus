package ys5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f546786d = 0;

    public b(ys5.c cVar, ys5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f546786d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f546786d;
        this.f546786d = i17 + 1;
        if (i17 == 0) {
            return sq2.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
