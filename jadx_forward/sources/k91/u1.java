package k91;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387310d = 0;

    public u1(k91.v1 v1Var, k91.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387310d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387310d;
        this.f387310d = i17 + 1;
        if (i17 == 0) {
            return k91.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
