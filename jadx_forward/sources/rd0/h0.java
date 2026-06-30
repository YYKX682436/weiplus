package rd0;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475743d = 0;

    public h0(rd0.i0 i0Var, rd0.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475743d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475743d;
        this.f475743d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
