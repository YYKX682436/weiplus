package dz;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f326282d = 0;

    public f(dz.g gVar, dz.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f326282d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f326282d;
        this.f326282d = i17 + 1;
        if (i17 == 0) {
            return gi1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
