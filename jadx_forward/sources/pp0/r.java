package pp0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438916d = 0;

    public r(pp0.s sVar, pp0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438916d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438916d;
        this.f438916d = i17 + 1;
        if (i17 == 0) {
            return yy0.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
