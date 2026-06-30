package uh0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f509265d = 0;

    public n(uh0.o oVar, uh0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f509265d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f509265d;
        this.f509265d = i17 + 1;
        if (i17 == 0) {
            return th0.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
