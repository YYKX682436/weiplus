package ge0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352444d = 0;

    public n(ge0.o oVar, ge0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352444d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352444d;
        this.f352444d = i17 + 1;
        if (i17 == 0) {
            return ge0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
