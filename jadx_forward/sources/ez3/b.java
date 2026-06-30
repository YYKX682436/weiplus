package ez3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339436d = 0;

    public b(ez3.c cVar, ez3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339436d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339436d;
        this.f339436d = i17 + 1;
        if (i17 == 0) {
            return ez3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
