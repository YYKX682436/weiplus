package c00;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118558d = 0;

    public t2(c00.u2 u2Var, c00.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118558d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118558d;
        this.f118558d = i17 + 1;
        if (i17 == 0) {
            return g10.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
