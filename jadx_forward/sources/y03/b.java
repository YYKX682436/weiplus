package y03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f540168d = 0;

    public b(y03.c cVar, y03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f540168d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f540168d;
        this.f540168d = i17 + 1;
        if (i17 == 0) {
            return g50.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
