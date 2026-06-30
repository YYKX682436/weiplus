package yy;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549526d = 0;

    public l(yy.m mVar, yy.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549526d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549526d;
        this.f549526d = i17 + 1;
        if (i17 == 0) {
            return yy.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
