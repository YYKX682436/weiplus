package bl3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f21722d = 0;

    public b(bl3.c cVar, bl3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21722d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21722d;
        this.f21722d = i17 + 1;
        if (i17 == 0) {
            return bl3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
