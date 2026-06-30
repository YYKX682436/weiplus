package ig0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f372842d = 0;

    public b(ig0.c cVar, ig0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f372842d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f372842d;
        this.f372842d = i17 + 1;
        if (i17 == 0) {
            return ig0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
