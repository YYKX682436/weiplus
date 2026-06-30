package bh0;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f20783d = 0;

    public e(bh0.f fVar, bh0.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20783d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f20783d;
        this.f20783d = i17 + 1;
        if (i17 == 0) {
            return bh0.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
