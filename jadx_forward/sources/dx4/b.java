package dx4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326032d = 0;

    public b(dx4.c cVar, dx4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326032d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326032d;
        this.f326032d = i17 + 1;
        if (i17 == 0) {
            return gx4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
