package py2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440595d = 0;

    public b(py2.c cVar, py2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440595d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440595d;
        this.f440595d = i17 + 1;
        if (i17 == 0) {
            return py2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
