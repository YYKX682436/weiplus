package pn4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438639d = 0;

    public g(pn4.h hVar, pn4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438639d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438639d;
        this.f438639d = i17 + 1;
        if (i17 == 0) {
            return pn4.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
