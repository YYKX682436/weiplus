package bi4;

/* loaded from: classes.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f21063d = 0;

    public k(bi4.l lVar, bi4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21063d < 12;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21063d;
        this.f21063d = i17 + 1;
        switch (i17) {
            case 0:
                return sj4.p0.INSTANCE;
            case 1:
                return dm3.w.INSTANCE;
            case 2:
                return sj4.l1.INSTANCE;
            case 3:
                return sj4.y0.INSTANCE;
            case 4:
                return sj4.m0.INSTANCE;
            case 5:
                return sj4.s0.INSTANCE;
            case 6:
                return ql2.l0.INSTANCE;
            case 7:
                return ql2.x.INSTANCE;
            case 8:
                return sj4.p1.INSTANCE;
            case 9:
                return sj4.s1.INSTANCE;
            case 10:
                return dm3.k0.INSTANCE;
            case 11:
                return ql2.p0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 12");
        }
    }
}
