package ln4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401434d = 0;

    public b(ln4.c cVar, ln4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401434d;
        this.f401434d = i17 + 1;
        if (i17 == 0) {
            return ln4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
