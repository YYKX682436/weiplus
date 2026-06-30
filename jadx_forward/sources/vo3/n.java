package vo3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f520114d = 0;

    public n(vo3.o oVar, vo3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f520114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f520114d;
        this.f520114d = i17 + 1;
        if (i17 == 0) {
            return vo3.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
