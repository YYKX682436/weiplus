package q60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441757d = 0;

    public b(q60.c cVar, q60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441757d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441757d;
        this.f441757d = i17 + 1;
        if (i17 == 0) {
            return q60.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
