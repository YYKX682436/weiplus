package hs;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366071d = 0;

    public s(hs.t tVar, hs.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366071d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366071d;
        this.f366071d = i17 + 1;
        if (i17 == 0) {
            return hs.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
