package sj4;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f490408d = 0;

    public n(sj4.o oVar, sj4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f490408d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f490408d;
        this.f490408d = i17 + 1;
        if (i17 == 0) {
            return sj4.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
