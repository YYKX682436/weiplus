package qs;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447709d = 0;

    public n0(qs.o0 o0Var, qs.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447709d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447709d;
        this.f447709d = i17 + 1;
        if (i17 == 0) {
            return qs.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
