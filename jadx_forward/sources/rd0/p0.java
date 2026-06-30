package rd0;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475755d = 0;

    public p0(rd0.q0 q0Var, rd0.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475755d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475755d;
        this.f475755d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2650x55bb7a46.gd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
