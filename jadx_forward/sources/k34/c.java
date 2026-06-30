package k34;

/* loaded from: classes.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385423d = 0;

    public c(k34.d dVar, k34.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385423d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385423d;
        this.f385423d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w4.INSTANCE;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d0.INSTANCE;
        }
        if (i17 == 2) {
            return au2.j.INSTANCE;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fg.INSTANCE;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.dg.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
