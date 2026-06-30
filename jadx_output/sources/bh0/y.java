package bh0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f20841d = 0;

    public y(bh0.z zVar, bh0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20841d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f20841d;
        this.f20841d = i17 + 1;
        if (i17 == 0) {
            return bh0.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
