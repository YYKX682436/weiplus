package n41;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416424d = 0;

    public f(n41.g gVar, n41.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416424d;
        this.f416424d = i17 + 1;
        if (i17 == 0) {
            return n41.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
