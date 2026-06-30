package k41;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385502d = 0;

    public b(k41.c cVar, k41.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385502d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385502d;
        this.f385502d = i17 + 1;
        if (i17 == 0) {
            return k41.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
