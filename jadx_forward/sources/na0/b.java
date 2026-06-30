package na0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417464d = 0;

    public b(na0.c cVar, na0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417464d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417464d;
        this.f417464d = i17 + 1;
        if (i17 == 0) {
            return na0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
