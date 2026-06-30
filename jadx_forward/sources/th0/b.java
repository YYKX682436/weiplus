package th0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500807d = 0;

    public b(th0.c cVar, th0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500807d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500807d;
        this.f500807d = i17 + 1;
        if (i17 == 0) {
            return th0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
