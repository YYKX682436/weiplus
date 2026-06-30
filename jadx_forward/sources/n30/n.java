package n30;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416000d = 0;

    public n(n30.o oVar, n30.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416000d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416000d;
        this.f416000d = i17 + 1;
        if (i17 == 0) {
            return m30.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
