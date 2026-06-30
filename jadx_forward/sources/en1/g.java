package en1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336808d = 0;

    public g(en1.h hVar, en1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336808d < 9;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336808d;
        this.f336808d = i17 + 1;
        switch (i17) {
            case 0:
                return cv1.h.INSTANCE;
            case 1:
                return qe4.h.INSTANCE;
            case 2:
                return uo3.t.INSTANCE;
            case 3:
                return pd0.i1.INSTANCE;
            case 4:
                return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.e1.INSTANCE;
            case 5:
                return kt1.s.INSTANCE;
            case 6:
                return ft1.d.INSTANCE;
            case 7:
                return h01.b0.INSTANCE;
            case 8:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.ga.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 9");
        }
    }
}
