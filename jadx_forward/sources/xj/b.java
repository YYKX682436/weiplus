package xj;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f536278d = 0;

    public b(xj.c cVar, xj.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f536278d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f536278d;
        this.f536278d = i17 + 1;
        if (i17 == 0) {
            return wj.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
