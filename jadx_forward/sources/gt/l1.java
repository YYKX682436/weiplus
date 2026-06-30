package gt;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356792d = 0;

    public l1(gt.m1 m1Var, gt.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356792d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356792d;
        this.f356792d = i17 + 1;
        if (i17 == 0) {
            return gt.w4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
