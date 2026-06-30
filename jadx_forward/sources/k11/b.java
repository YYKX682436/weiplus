package k11;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384704d = 0;

    public b(k11.c cVar, k11.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384704d;
        this.f384704d = i17 + 1;
        if (i17 == 0) {
            return k11.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
