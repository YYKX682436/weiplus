package dm3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323227d = 0;

    public f(dm3.g gVar, dm3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323227d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323227d;
        this.f323227d = i17 + 1;
        if (i17 == 0) {
            return dm3.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
