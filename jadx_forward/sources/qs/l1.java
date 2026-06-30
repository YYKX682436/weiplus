package qs;

/* loaded from: classes6.dex */
public class l1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447707d = 0;

    public l1(qs.m1 m1Var, qs.k1 k1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447707d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447707d;
        this.f447707d = i17 + 1;
        if (i17 == 0) {
            return qs.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
