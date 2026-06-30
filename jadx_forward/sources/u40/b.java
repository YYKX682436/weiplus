package u40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506132d = 0;

    public b(u40.c cVar, u40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506132d;
        this.f506132d = i17 + 1;
        if (i17 == 0) {
            return u40.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
