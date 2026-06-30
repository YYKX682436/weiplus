package ge0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352418d = 0;

    public b(ge0.c cVar, ge0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352418d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352418d;
        this.f352418d = i17 + 1;
        if (i17 == 0) {
            return ge0.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
