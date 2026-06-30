package zl;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f555083d = 0;

    public b(zl.c cVar, zl.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f555083d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f555083d;
        this.f555083d = i17 + 1;
        if (i17 == 0) {
            return v61.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
