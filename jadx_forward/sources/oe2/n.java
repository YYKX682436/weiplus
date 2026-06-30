package oe2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426312d = 0;

    public n(oe2.o oVar, oe2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426312d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426312d;
        this.f426312d = i17 + 1;
        if (i17 == 0) {
            return oe2.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
