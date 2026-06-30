package ga0;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351362d = 0;

    public b(ga0.c cVar, ga0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351362d < 8;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351362d;
        this.f351362d = i17 + 1;
        switch (i17) {
            case 0:
                return v43.u.INSTANCE;
            case 1:
                return z62.z.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.r0.INSTANCE;
            case 3:
                return xv4.i.INSTANCE;
            case 4:
                return com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k.INSTANCE;
            case 5:
                return bz4.g0.INSTANCE;
            case 6:
                return nf0.v.INSTANCE;
            case 7:
                return z62.e0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 8");
        }
    }
}
