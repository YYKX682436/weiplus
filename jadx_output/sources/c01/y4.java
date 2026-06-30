package c01;

/* loaded from: classes6.dex */
public class y4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37570d = 0;

    public y4(c01.z4 z4Var, c01.x4 x4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37570d;
        this.f37570d = i17 + 1;
        if (i17 == 0) {
            return np.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
