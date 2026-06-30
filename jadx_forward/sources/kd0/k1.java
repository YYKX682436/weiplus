package kd0;

/* loaded from: classes6.dex */
public class k1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f388195d = 0;

    public k1(kd0.l1 l1Var, kd0.j1 j1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f388195d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f388195d;
        this.f388195d = i17 + 1;
        if (i17 == 0) {
            return jd0.r2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
