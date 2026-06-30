package fy1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348765d = 0;

    public b(fy1.c cVar, fy1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348765d;
        this.f348765d = i17 + 1;
        if (i17 == 0) {
            return my1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
