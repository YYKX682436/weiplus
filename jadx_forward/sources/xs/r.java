package xs;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f537802d = 0;

    public r(xs.s sVar, xs.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f537802d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f537802d;
        this.f537802d = i17 + 1;
        if (i17 == 0) {
            return pl0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
