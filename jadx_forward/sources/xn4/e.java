package xn4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f537146d = 0;

    public e(xn4.f fVar, xn4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f537146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f537146d;
        this.f537146d = i17 + 1;
        if (i17 == 0) {
            return xn4.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
