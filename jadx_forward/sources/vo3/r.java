package vo3;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f520117d = 0;

    public r(vo3.s sVar, vo3.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f520117d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f520117d;
        this.f520117d = i17 + 1;
        if (i17 == 0) {
            return vo3.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
