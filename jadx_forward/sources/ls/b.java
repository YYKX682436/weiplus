package ls;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402304d = 0;

    public b(ls.c cVar, ls.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402304d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402304d;
        this.f402304d = i17 + 1;
        if (i17 == 0) {
            return ls.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
