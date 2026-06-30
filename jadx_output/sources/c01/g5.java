package c01;

/* loaded from: classes6.dex */
public class g5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37201d = 0;

    public g5(c01.h5 h5Var, c01.f5 f5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37201d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37201d;
        this.f37201d = i17 + 1;
        if (i17 == 0) {
            return jy4.a0.INSTANCE;
        }
        if (i17 == 1) {
            return c73.r.INSTANCE;
        }
        if (i17 == 2) {
            return iy4.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
