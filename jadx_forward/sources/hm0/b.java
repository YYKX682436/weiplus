package hm0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363713d = 0;

    public b(hm0.c cVar, hm0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363713d < 11;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363713d;
        this.f363713d = i17 + 1;
        switch (i17) {
            case 0:
                return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.y0.INSTANCE;
            case 1:
                return qb0.m.INSTANCE;
            case 2:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.a0.INSTANCE;
            case 3:
                return xc.m.INSTANCE;
            case 4:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a0.INSTANCE;
            case 5:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o.INSTANCE;
            case 6:
                return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.v0.INSTANCE;
            case 7:
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t7.INSTANCE;
            case 8:
                return com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f.p0.INSTANCE;
            case 9:
                return v43.o.INSTANCE;
            case 10:
                return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.i.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 11");
        }
    }
}
