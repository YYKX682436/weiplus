package k70;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386201d = 0;

    public n(k70.o oVar, k70.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386201d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386201d;
        this.f386201d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p793x2f25ba7b.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
