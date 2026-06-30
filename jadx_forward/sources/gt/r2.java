package gt;

/* loaded from: classes6.dex */
public class r2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356836d = 0;

    public r2(gt.s2 s2Var, gt.q2 q2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356836d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356836d;
        this.f356836d = i17 + 1;
        if (i17 == 0) {
            return gt.v5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
