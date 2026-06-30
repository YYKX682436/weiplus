package rk4;

/* loaded from: classes6.dex */
public class e0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f478157d = 0;

    public e0(rk4.f0 f0Var, rk4.d0 d0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f478157d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f478157d;
        this.f478157d = i17 + 1;
        if (i17 == 0) {
            return rk4.q6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
