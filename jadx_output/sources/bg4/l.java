package bg4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f20734d = 0;

    public l(bg4.m mVar, bg4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20734d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f20734d;
        this.f20734d = i17 + 1;
        if (i17 == 0) {
            return bg4.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
