package oy4;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431609d = 0;

    public r(oy4.s sVar, oy4.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431609d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431609d;
        this.f431609d = i17 + 1;
        if (i17 == 0) {
            return oy4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
