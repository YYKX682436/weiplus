package rm;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f478923d = 0;

    public s(rm.t tVar, rm.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f478923d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f478923d;
        this.f478923d = i17 + 1;
        if (i17 == 0) {
            return ox.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
