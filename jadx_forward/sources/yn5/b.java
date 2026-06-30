package yn5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f545551d = 0;

    public b(yn5.c cVar, yn5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f545551d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f545551d;
        this.f545551d = i17 + 1;
        if (i17 == 0) {
            return xn5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
