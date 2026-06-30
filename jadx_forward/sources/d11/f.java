package d11;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307193d = 0;

    public f(d11.g gVar, d11.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307193d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307193d;
        this.f307193d = i17 + 1;
        if (i17 == 0) {
            return d11.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
