package bv;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f106204d = 0;

    public q(bv.r rVar, bv.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f106204d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f106204d;
        this.f106204d = i17 + 1;
        if (i17 == 0) {
            return bv.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
