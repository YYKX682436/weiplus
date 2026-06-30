package h0;

/* loaded from: classes16.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f359338d = 0;

    public k(h0.l lVar, h0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359338d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359338d;
        this.f359338d = i17 + 1;
        if (i17 == 0) {
            return g0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
