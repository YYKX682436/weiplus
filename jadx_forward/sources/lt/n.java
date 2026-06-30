package lt;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402685d = 0;

    public n(lt.o oVar, lt.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402685d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402685d;
        this.f402685d = i17 + 1;
        if (i17 == 0) {
            return kt.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
