package ij1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f373202d = 0;

    public b(ij1.c cVar, ij1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f373202d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f373202d;
        this.f373202d = i17 + 1;
        if (i17 == 0) {
            return ij1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
