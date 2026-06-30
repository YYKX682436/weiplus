package gm0;

/* loaded from: classes.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f354676d = 0;

    public a1(gm0.b1 b1Var, gm0.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f354676d < 12;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f354676d;
        this.f354676d = i17 + 1;
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.w1.INSTANCE;
            case 1:
                return o30.h.INSTANCE;
            case 2:
                return sf0.m.INSTANCE;
            case 3:
                return np3.m.INSTANCE;
            case 4:
                return dt3.g.INSTANCE;
            case 5:
                return yv.h.INSTANCE;
            case 6:
                return ys3.n.INSTANCE;
            case 7:
                return h14.q0.INSTANCE;
            case 8:
                return w50.j.INSTANCE;
            case 9:
                return f01.q1.INSTANCE;
            case 10:
                return we0.v1.INSTANCE;
            case 11:
                return gt.f.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 12");
        }
    }
}
