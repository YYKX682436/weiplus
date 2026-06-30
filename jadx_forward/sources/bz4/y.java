package bz4;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118379d = 0;

    public y(bz4.z zVar, bz4.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118379d;
        this.f118379d = i17 + 1;
        if (i17 == 0) {
            return bz4.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
