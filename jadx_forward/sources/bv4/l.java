package bv4;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f106275d = 0;

    public l(bv4.m mVar, bv4.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f106275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f106275d;
        this.f106275d = i17 + 1;
        if (i17 == 0) {
            return bv4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
