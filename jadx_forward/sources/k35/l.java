package k35;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385444d = 0;

    public l(k35.m mVar, k35.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385444d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385444d;
        this.f385444d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
