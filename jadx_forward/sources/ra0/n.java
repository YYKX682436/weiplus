package ra0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475008d = 0;

    public n(ra0.o oVar, ra0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475008d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475008d;
        this.f475008d = i17 + 1;
        if (i17 == 0) {
            return nn3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
