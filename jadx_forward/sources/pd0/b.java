package pd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434974d = 0;

    public b(pd0.c cVar, pd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434974d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434974d;
        this.f434974d = i17 + 1;
        if (i17 == 0) {
            return pd0.c1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
