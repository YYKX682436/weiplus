package vx;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f522751d = 0;

    public b(vx.c cVar, vx.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f522751d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f522751d;
        this.f522751d = i17 + 1;
        if (i17 == 0) {
            return ux.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
