package ec4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332706d = 0;

    public l(ec4.m mVar, ec4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332706d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332706d;
        this.f332706d = i17 + 1;
        if (i17 == 0) {
            return ec4.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
