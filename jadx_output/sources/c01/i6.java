package c01;

/* loaded from: classes6.dex */
public class i6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37251d = 0;

    public i6(c01.j6 j6Var, c01.h6 h6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37251d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37251d;
        this.f37251d = i17 + 1;
        if (i17 == 0) {
            return c01.ub.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
