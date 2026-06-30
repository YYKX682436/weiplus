package wd0;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526278d = 0;

    public l(wd0.m mVar, wd0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526278d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526278d;
        this.f526278d = i17 + 1;
        if (i17 == 0) {
            return vd0.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
