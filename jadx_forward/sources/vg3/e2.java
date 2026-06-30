package vg3;

/* loaded from: classes6.dex */
public class e2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518229d = 0;

    public e2(vg3.f2 f2Var, vg3.d2 d2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518229d < 11;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518229d;
        this.f518229d = i17 + 1;
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i0.INSTANCE;
            case 1:
                return ib3.z.INSTANCE;
            case 2:
                return ar1.e.INSTANCE;
            case 3:
                return fr4.n.INSTANCE;
            case 4:
                return sv.h.INSTANCE;
            case 5:
                return mr1.f.INSTANCE;
            case 6:
                return ji4.z.INSTANCE;
            case 7:
                return on.j.INSTANCE;
            case 8:
                return lw3.s.INSTANCE;
            case 9:
                return qb2.r0.INSTANCE;
            case 10:
                return z53.a0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 11");
        }
    }
}
