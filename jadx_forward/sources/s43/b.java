package s43;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f484486d = 0;

    public b(s43.c cVar, s43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f484486d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f484486d;
        this.f484486d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
