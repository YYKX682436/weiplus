package c90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39726d = 0;

    public b(c90.c cVar, c90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39726d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39726d;
        this.f39726d = i17 + 1;
        if (i17 == 0) {
            return c90.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
