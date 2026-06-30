package d34;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307839d = 0;

    public b(d34.c cVar, d34.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307839d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307839d;
        this.f307839d = i17 + 1;
        if (i17 == 0) {
            return d34.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
