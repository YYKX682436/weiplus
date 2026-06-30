package mf0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f407545d = 0;

    public n(mf0.o oVar, mf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f407545d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f407545d;
        this.f407545d = i17 + 1;
        if (i17 == 0) {
            return lf0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
