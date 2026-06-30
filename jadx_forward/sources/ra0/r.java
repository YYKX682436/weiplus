package ra0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475011d = 0;

    public r(ra0.s sVar, ra0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475011d;
        this.f475011d = i17 + 1;
        if (i17 == 0) {
            return en3.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
