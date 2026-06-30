package c01;

/* loaded from: classes6.dex */
public class y2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119100d = 0;

    public y2(c01.z2 z2Var, c01.x2 x2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119100d;
        this.f119100d = i17 + 1;
        if (i17 == 0) {
            return c01.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
