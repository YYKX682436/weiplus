package ub0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f507528d = 0;

    public f(ub0.g gVar, ub0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f507528d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f507528d;
        this.f507528d = i17 + 1;
        if (i17 == 0) {
            return ub0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
