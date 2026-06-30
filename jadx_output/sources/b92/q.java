package b92;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18502d = 0;

    public q(b92.r rVar, b92.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18502d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18502d;
        this.f18502d = i17 + 1;
        if (i17 == 0) {
            return b92.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
