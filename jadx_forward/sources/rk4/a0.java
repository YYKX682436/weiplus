package rk4;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f478061d = 0;

    public a0(rk4.b0 b0Var, rk4.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f478061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f478061d;
        this.f478061d = i17 + 1;
        if (i17 == 0) {
            return rk4.z4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
