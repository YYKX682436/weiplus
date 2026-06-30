package l93;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398808d = 0;

    public f(l93.g gVar, l93.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398808d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398808d;
        this.f398808d = i17 + 1;
        if (i17 == 0) {
            return l93.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
