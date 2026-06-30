package qq0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447424d = 0;

    public b(qq0.c cVar, qq0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447424d;
        this.f447424d = i17 + 1;
        if (i17 == 0) {
            return qq0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
