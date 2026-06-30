package ar1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94908d = 0;

    public g(ar1.h hVar, ar1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94908d;
        this.f94908d = i17 + 1;
        if (i17 == 0) {
            return ar1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
