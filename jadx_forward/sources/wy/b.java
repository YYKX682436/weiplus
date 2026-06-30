package wy;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532124d = 0;

    public b(wy.c cVar, wy.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532124d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532124d;
        this.f532124d = i17 + 1;
        if (i17 == 0) {
            return vy.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
