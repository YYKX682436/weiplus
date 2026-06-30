package we0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526630d = 0;

    public b(we0.c cVar, we0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526630d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526630d;
        this.f526630d = i17 + 1;
        if (i17 == 0) {
            return we0.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
