package fy3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348775d = 0;

    public b(fy3.c cVar, fy3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348775d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348775d;
        this.f348775d = i17 + 1;
        if (i17 == 0) {
            return my3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
