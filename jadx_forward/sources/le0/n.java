package le0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f399656d = 0;

    public n(le0.o oVar, le0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f399656d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f399656d;
        this.f399656d = i17 + 1;
        if (i17 == 0) {
            return kj1.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
