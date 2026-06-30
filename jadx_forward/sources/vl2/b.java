package vl2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f519343d = 0;

    public b(vl2.c cVar, vl2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f519343d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f519343d;
        this.f519343d = i17 + 1;
        if (i17 == 0) {
            return vl2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
