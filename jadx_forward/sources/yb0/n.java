package yb0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542172d = 0;

    public n(yb0.o oVar, yb0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542172d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542172d;
        this.f542172d = i17 + 1;
        if (i17 == 0) {
            return yb0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
