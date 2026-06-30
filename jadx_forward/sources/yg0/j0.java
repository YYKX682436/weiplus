package yg0;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543732d = 0;

    public j0(yg0.k0 k0Var, yg0.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543732d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543732d;
        this.f543732d = i17 + 1;
        if (i17 == 0) {
            return yg0.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
