package yg0;

/* loaded from: classes6.dex */
public class j2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543735d = 0;

    public j2(yg0.k2 k2Var, yg0.i2 i2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543735d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543735d;
        this.f543735d = i17 + 1;
        if (i17 == 0) {
            return yg0.t4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
