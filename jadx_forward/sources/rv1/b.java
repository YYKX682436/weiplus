package rv1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481904d = 0;

    public b(rv1.c cVar, rv1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481904d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481904d;
        this.f481904d = i17 + 1;
        if (i17 == 0) {
            return c01.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
