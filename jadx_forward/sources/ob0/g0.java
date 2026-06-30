package ob0;

/* loaded from: classes6.dex */
public class g0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425438d = 0;

    public g0(ob0.h0 h0Var, ob0.f0 f0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425438d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425438d;
        this.f425438d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
