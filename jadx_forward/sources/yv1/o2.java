package yv1;

/* loaded from: classes6.dex */
public class o2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547663d = 0;

    public o2(yv1.p2 p2Var, yv1.n2 n2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547663d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547663d;
        this.f547663d = i17 + 1;
        if (i17 == 0) {
            return yv1.k1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
