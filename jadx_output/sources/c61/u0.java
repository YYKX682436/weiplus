package c61;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39313d = 0;

    public u0(c61.v0 v0Var, c61.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39313d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39313d;
        this.f39313d = i17 + 1;
        if (i17 == 0) {
            return c61.u9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
