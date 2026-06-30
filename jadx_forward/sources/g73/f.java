package g73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350799d = 0;

    public f(g73.g gVar, g73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350799d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350799d;
        this.f350799d = i17 + 1;
        if (i17 == 0) {
            return g73.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
