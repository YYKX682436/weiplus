package vd0;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516948d = 0;

    public g0(vd0.h0 h0Var, vd0.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516948d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516948d;
        this.f516948d = i17 + 1;
        if (i17 == 0) {
            return vd0.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
