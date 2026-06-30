package j73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379581d = 0;

    public b(j73.c cVar, j73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379581d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379581d;
        this.f379581d = i17 + 1;
        if (i17 == 0) {
            return i73.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
