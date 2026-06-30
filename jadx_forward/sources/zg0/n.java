package zg0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554295d = 0;

    public n(zg0.o oVar, zg0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554295d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554295d;
        this.f554295d = i17 + 1;
        if (i17 == 0) {
            return yg0.v2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
