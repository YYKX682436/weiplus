package mz2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414692d = 0;

    public n(mz2.o oVar, mz2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414692d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414692d;
        this.f414692d = i17 + 1;
        if (i17 == 0) {
            return mz2.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
