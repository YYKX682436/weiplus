package gt;

/* loaded from: classes6.dex */
public class d3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356734d = 0;

    public d3(gt.e3 e3Var, gt.c3 c3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356734d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356734d;
        this.f356734d = i17 + 1;
        if (i17 == 0) {
            return gt.e6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
