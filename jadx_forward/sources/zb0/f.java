package zb0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552773d = 0;

    public f(zb0.g gVar, zb0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552773d;
        this.f552773d = i17 + 1;
        if (i17 == 0) {
            return yb0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
