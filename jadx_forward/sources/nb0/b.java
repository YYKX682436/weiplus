package nb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417562d = 0;

    public b(nb0.c cVar, nb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417562d;
        this.f417562d = i17 + 1;
        if (i17 == 0) {
            return mb0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
