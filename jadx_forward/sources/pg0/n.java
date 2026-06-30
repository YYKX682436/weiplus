package pg0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435561d = 0;

    public n(pg0.o oVar, pg0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435561d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435561d;
        this.f435561d = i17 + 1;
        if (i17 == 0) {
            return pg0.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
