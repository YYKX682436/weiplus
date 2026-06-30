package sx;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495028d = 0;

    public b(sx.c cVar, sx.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495028d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495028d;
        this.f495028d = i17 + 1;
        if (i17 == 0) {
            return rx.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
