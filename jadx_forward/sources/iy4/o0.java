package iy4;

/* loaded from: classes6.dex */
public class o0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f377513d = 0;

    public o0(iy4.p0 p0Var, iy4.n0 n0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f377513d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f377513d;
        this.f377513d = i17 + 1;
        if (i17 == 0) {
            return iy4.g1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
