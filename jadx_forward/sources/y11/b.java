package y11;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f540336d = 0;

    public b(y11.c cVar, y11.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f540336d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f540336d;
        this.f540336d = i17 + 1;
        if (i17 == 0) {
            return y11.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
