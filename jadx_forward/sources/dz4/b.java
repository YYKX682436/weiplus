package dz4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326699d = 0;

    public b(dz4.c cVar, dz4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326699d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326699d;
        this.f326699d = i17 + 1;
        if (i17 == 0) {
            return dz4.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
