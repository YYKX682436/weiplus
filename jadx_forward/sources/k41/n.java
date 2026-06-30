package k41;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385560d = 0;

    public n(k41.o oVar, k41.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385560d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385560d;
        this.f385560d = i17 + 1;
        if (i17 == 0) {
            return bb0.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
