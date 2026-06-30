package pu4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439971d = 0;

    public e(pu4.f fVar, pu4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439971d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439971d;
        this.f439971d = i17 + 1;
        if (i17 == 0) {
            return pu4.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
