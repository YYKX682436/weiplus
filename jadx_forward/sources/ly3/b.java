package ly3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403784d = 0;

    public b(ly3.c cVar, ly3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403784d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403784d;
        this.f403784d = i17 + 1;
        if (i17 == 0) {
            return ly3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
