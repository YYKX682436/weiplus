package zg3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554366d = 0;

    public e(zg3.f fVar, zg3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554366d;
        this.f554366d = i17 + 1;
        if (i17 == 0) {
            return zg3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
