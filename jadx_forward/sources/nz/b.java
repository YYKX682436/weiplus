package nz;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f423017d = 0;

    public b(nz.c cVar, nz.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f423017d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f423017d;
        this.f423017d = i17 + 1;
        if (i17 == 0) {
            return mz.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
