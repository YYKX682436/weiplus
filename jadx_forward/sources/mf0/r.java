package mf0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407548d = 0;

    public r(mf0.s sVar, mf0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407548d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407548d;
        this.f407548d = i17 + 1;
        if (i17 == 0) {
            return lf0.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
