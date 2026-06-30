package pd0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434989d = 0;

    public f(pd0.g gVar, pd0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434989d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434989d;
        this.f434989d = i17 + 1;
        if (i17 == 0) {
            return pd0.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
