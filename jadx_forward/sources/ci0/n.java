package ci0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f123190d = 0;

    public n(ci0.o oVar, ci0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f123190d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f123190d;
        this.f123190d = i17 + 1;
        if (i17 == 0) {
            return tv3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
