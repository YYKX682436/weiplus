package sg1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f489408d = 0;

    public b(sg1.c cVar, sg1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f489408d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f489408d;
        this.f489408d = i17 + 1;
        if (i17 == 0) {
            return rg1.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
