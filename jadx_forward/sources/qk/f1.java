package qk;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445635d = 0;

    public f1(qk.g1 g1Var, qk.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445635d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445635d;
        this.f445635d = i17 + 1;
        if (i17 == 0) {
            return c01.r0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
