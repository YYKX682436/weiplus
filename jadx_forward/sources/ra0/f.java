package ra0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475002d = 0;

    public f(ra0.g gVar, ra0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475002d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475002d;
        this.f475002d = i17 + 1;
        if (i17 == 0) {
            return en3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
