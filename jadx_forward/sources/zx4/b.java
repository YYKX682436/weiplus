package zx4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558646d = 0;

    public b(zx4.c cVar, zx4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558646d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558646d;
        this.f558646d = i17 + 1;
        if (i17 == 0) {
            return zx4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
