package mw3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413276d = 0;

    public n(mw3.o oVar, mw3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413276d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413276d;
        this.f413276d = i17 + 1;
        if (i17 == 0) {
            return mw3.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
