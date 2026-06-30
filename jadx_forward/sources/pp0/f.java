package pp0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f438904d = 0;

    public f(pp0.g gVar, pp0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f438904d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f438904d;
        this.f438904d = i17 + 1;
        if (i17 == 0) {
            return yy0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
