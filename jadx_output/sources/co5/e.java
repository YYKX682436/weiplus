package co5;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f43824d = 0;

    public e(co5.f fVar, co5.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f43824d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f43824d;
        this.f43824d = i17 + 1;
        if (i17 == 0) {
            return co5.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
