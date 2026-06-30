package e60;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331248d = 0;

    public l0(e60.m0 m0Var, e60.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331248d;
        this.f331248d = i17 + 1;
        if (i17 == 0) {
            return d60.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
