package gt;

/* loaded from: classes6.dex */
public class v2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356862d = 0;

    public v2(gt.w2 w2Var, gt.u2 u2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356862d;
        this.f356862d = i17 + 1;
        if (i17 == 0) {
            return gt.y5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
