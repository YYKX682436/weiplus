package bz4;

/* loaded from: classes.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118373d = 0;

    public q(bz4.r rVar, bz4.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118373d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118373d;
        this.f118373d = i17 + 1;
        if (i17 == 0) {
            return bz4.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
