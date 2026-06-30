package ks;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393107d = 0;

    public b(ks.c cVar, ks.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393107d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393107d;
        this.f393107d = i17 + 1;
        if (i17 == 0) {
            return ks.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
