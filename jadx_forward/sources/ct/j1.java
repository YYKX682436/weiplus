package ct;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303695d = 0;

    public j1(ct.k1 k1Var, ct.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303695d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303695d;
        this.f303695d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
