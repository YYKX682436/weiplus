package gx4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358951d = 0;

    public g(gx4.h hVar, gx4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358951d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358951d;
        this.f358951d = i17 + 1;
        if (i17 == 0) {
            return gx4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
