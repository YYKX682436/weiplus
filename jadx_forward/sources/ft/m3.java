package ft;

/* loaded from: classes6.dex */
public class m3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347942d = 0;

    public m3(ft.n3 n3Var, ft.l3 l3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347942d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347942d;
        this.f347942d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
