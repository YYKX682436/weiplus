package gt;

/* loaded from: classes6.dex */
public class x1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356876d = 0;

    public x1(gt.y1 y1Var, gt.w1 w1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356876d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356876d;
        this.f356876d = i17 + 1;
        if (i17 == 0) {
            return gt.f5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
