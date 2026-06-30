package nq1;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420498d = 0;

    public l(nq1.m mVar, nq1.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420498d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420498d;
        this.f420498d = i17 + 1;
        if (i17 == 0) {
            return nq1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
