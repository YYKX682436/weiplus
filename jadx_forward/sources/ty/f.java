package ty;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f504252d = 0;

    public f(ty.g gVar, ty.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f504252d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f504252d;
        this.f504252d = i17 + 1;
        if (i17 == 0) {
            return eo.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
