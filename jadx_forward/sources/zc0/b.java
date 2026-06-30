package zc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552913d = 0;

    public b(zc0.c cVar, zc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552913d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552913d;
        this.f552913d = i17 + 1;
        if (i17 == 0) {
            return zc0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
