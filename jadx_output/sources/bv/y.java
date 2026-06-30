package bv;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24683d = 0;

    public y(bv.z zVar, bv.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24683d;
        this.f24683d = i17 + 1;
        if (i17 == 0) {
            return bv.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
