package ap3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94319d = 0;

    public b(ap3.c cVar, ap3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94319d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94319d;
        this.f94319d = i17 + 1;
        if (i17 == 0) {
            return kt.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
