package jd0;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f380610d = 0;

    public l0(jd0.m0 m0Var, jd0.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f380610d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f380610d;
        this.f380610d = i17 + 1;
        if (i17 == 0) {
            return jd0.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
