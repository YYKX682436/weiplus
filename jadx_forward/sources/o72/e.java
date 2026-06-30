package o72;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424861d = 0;

    public e(o72.f fVar, o72.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424861d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424861d;
        this.f424861d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
