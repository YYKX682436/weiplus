package c01;

/* loaded from: classes6.dex */
public class e6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118671d = 0;

    public e6(c01.f6 f6Var, c01.d6 d6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118671d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118671d;
        this.f118671d = i17 + 1;
        switch (i17) {
            case 0:
                return ft1.s.INSTANCE;
            case 1:
                return ji4.e0.INSTANCE;
            case 2:
                return k41.c0.INSTANCE;
            case 3:
                return hr4.j.INSTANCE;
            case 4:
                return br1.v.INSTANCE;
            case 5:
                return y53.h0.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x2.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
