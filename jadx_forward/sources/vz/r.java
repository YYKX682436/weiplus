package vz;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f523092d = 0;

    public r(vz.s sVar, vz.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f523092d < 4;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f523092d;
        this.f523092d = i17 + 1;
        if (i17 == 0) {
            return r43.h0.INSTANCE;
        }
        if (i17 == 1) {
            return n02.b.INSTANCE;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1744xb1584af1.l.INSTANCE;
        }
        if (i17 == 3) {
            return n02.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 4");
    }
}
