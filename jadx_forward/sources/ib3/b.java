package ib3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371714d = 0;

    public b(ib3.c cVar, ib3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371714d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371714d;
        this.f371714d = i17 + 1;
        if (i17 == 0) {
            return ib3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
