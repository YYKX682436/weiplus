package p90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434392d = 0;

    public b(p90.c cVar, p90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434392d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434392d;
        this.f434392d = i17 + 1;
        if (i17 == 0) {
            return oh3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
