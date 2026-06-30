package j20;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378779d = 0;

    public r(j20.s sVar, j20.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f378779d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f378779d;
        this.f378779d = i17 + 1;
        if (i17 == 0) {
            return j20.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
