package zb0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552782d = 0;

    public r(zb0.s sVar, zb0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552782d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552782d;
        this.f552782d = i17 + 1;
        if (i17 == 0) {
            return yb0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
