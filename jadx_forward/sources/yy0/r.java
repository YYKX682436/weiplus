package yy0;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549833d = 0;

    public r(yy0.s sVar, yy0.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549833d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549833d;
        this.f549833d = i17 + 1;
        if (i17 == 0) {
            return yy0.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
