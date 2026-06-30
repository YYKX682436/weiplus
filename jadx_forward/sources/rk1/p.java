package rk1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477974d = 0;

    public p(rk1.q qVar, rk1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477974d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477974d;
        this.f477974d = i17 + 1;
        if (i17 == 0) {
            return rk1.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
