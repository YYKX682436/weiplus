package xv;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538893d = 0;

    public n(xv.o oVar, xv.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538893d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538893d;
        this.f538893d = i17 + 1;
        if (i17 == 0) {
            return wv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
