package nd2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417964d = 0;

    public b(nd2.c cVar, nd2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417964d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417964d;
        this.f417964d = i17 + 1;
        if (i17 == 0) {
            return nd2.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
