package th0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f500821d = 0;

    public f(th0.g gVar, th0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f500821d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f500821d;
        this.f500821d = i17 + 1;
        if (i17 == 0) {
            return th0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
