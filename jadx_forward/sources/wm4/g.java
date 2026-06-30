package wm4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f528824d = 0;

    public g(wm4.h hVar, wm4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f528824d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f528824d;
        this.f528824d = i17 + 1;
        if (i17 == 0) {
            return wm4.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
