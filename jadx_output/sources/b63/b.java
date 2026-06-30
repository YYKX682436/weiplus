package b63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18143d = 0;

    public b(b63.c cVar, b63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18143d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18143d;
        this.f18143d = i17 + 1;
        if (i17 == 0) {
            return b63.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
