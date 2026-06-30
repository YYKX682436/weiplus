package r01;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f449784d = 0;

    public t2(r01.u2 u2Var, r01.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f449784d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f449784d;
        this.f449784d = i17 + 1;
        if (i17 == 0) {
            return r01.s3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
