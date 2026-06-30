package ze4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f553318d = 0;

    public b(ze4.c cVar, ze4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f553318d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f553318d;
        this.f553318d = i17 + 1;
        if (i17 == 0) {
            return ye4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
