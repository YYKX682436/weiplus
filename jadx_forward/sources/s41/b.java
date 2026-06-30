package s41;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f484453d = 0;

    public b(s41.c cVar, s41.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f484453d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f484453d;
        this.f484453d = i17 + 1;
        if (i17 == 0) {
            return s41.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
