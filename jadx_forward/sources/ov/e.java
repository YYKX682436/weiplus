package ov;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430607d = 0;

    public e(ov.f fVar, ov.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430607d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430607d;
        this.f430607d = i17 + 1;
        if (i17 == 0) {
            return ov.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
