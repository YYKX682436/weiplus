package j45;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379243d = 0;

    public b(j45.c cVar, j45.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379243d < 11;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379243d;
        this.f379243d = i17 + 1;
        switch (i17) {
            case 0:
                return bn3.l.INSTANCE;
            case 1:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.b0.INSTANCE;
            case 2:
                return nf0.x.INSTANCE;
            case 3:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.t.INSTANCE;
            case 4:
                return r43.j0.INSTANCE;
            case 5:
                return t14.w.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p1006xc5476f33.biz.y.INSTANCE;
            case 7:
                return pg2.o0.INSTANCE;
            case 8:
                return ah0.e2.INSTANCE;
            case 9:
                return d34.h0.INSTANCE;
            case 10:
                return j55.f.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 11");
        }
    }
}
