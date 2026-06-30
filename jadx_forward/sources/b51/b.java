package b51;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99543d = 0;

    public b(b51.c cVar, b51.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99543d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99543d;
        this.f99543d = i17 + 1;
        if (i17 == 0) {
            return b51.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
