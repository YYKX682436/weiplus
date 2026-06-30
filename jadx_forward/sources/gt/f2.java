package gt;

/* loaded from: classes6.dex */
public class f2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356751d = 0;

    public f2(gt.g2 g2Var, gt.e2 e2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356751d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356751d;
        this.f356751d = i17 + 1;
        if (i17 == 0) {
            return gt.l5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
