package zv4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f557989d = 0;

    public b(zv4.c cVar, zv4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f557989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f557989d;
        this.f557989d = i17 + 1;
        if (i17 == 0) {
            return zv4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
