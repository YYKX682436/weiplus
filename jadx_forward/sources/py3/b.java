package py3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440614d = 0;

    public b(py3.c cVar, py3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440614d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440614d;
        this.f440614d = i17 + 1;
        if (i17 == 0) {
            return py3.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
