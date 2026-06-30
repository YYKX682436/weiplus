package n60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416703d = 0;

    public b(n60.c cVar, n60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416703d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416703d;
        this.f416703d = i17 + 1;
        if (i17 == 0) {
            return m60.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
