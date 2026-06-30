package yc1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542313d = 0;

    public e(yc1.f fVar, yc1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542313d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542313d;
        this.f542313d = i17 + 1;
        if (i17 == 0) {
            return yc1.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
