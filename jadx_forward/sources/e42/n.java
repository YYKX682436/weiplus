package e42;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330876d = 0;

    public n(e42.o oVar, e42.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330876d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330876d;
        this.f330876d = i17 + 1;
        if (i17 == 0) {
            return h62.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
