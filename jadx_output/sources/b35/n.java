package b35;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f17744d = 0;

    public n(b35.o oVar, b35.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17744d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f17744d;
        this.f17744d = i17 + 1;
        if (i17 == 0) {
            return b35.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
