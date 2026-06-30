package iy4;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f377498d = 0;

    public g0(iy4.h0 h0Var, iy4.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f377498d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f377498d;
        this.f377498d = i17 + 1;
        if (i17 == 0) {
            return iy4.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
