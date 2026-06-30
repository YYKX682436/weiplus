package ar3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94917d = 0;

    public b(ar3.c cVar, ar3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94917d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94917d;
        this.f94917d = i17 + 1;
        if (i17 == 0) {
            return ar3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
