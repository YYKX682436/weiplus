package hs;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366058d = 0;

    public g(hs.h hVar, hs.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366058d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366058d;
        this.f366058d = i17 + 1;
        if (i17 == 0) {
            return hs.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
