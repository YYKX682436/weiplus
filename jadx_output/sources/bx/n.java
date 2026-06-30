package bx;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36225d = 0;

    public n(bx.o oVar, bx.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36225d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36225d;
        this.f36225d = i17 + 1;
        if (i17 == 0) {
            return cx.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
