package ts;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f503045d = 0;

    public b(ts.c cVar, ts.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f503045d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f503045d;
        this.f503045d = i17 + 1;
        if (i17 == 0) {
            return ss.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
