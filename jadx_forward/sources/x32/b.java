package x32;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533133d = 0;

    public b(x32.c cVar, x32.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533133d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533133d;
        this.f533133d = i17 + 1;
        if (i17 == 0) {
            return x32.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
