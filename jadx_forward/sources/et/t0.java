package et;

/* loaded from: classes6.dex */
public class t0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338040d = 0;

    public t0(et.u0 u0Var, et.s0 s0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338040d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338040d;
        this.f338040d = i17 + 1;
        if (i17 == 0) {
            return et.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
