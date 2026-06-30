package e55;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331197d = 0;

    public b(e55.c cVar, e55.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331197d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331197d;
        this.f331197d = i17 + 1;
        if (i17 == 0) {
            return e55.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
