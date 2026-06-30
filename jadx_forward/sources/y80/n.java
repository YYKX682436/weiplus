package y80;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541418d = 0;

    public n(y80.o oVar, y80.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541418d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541418d;
        this.f541418d = i17 + 1;
        if (i17 == 0) {
            return y80.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
