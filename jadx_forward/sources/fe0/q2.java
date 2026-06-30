package fe0;

/* loaded from: classes6.dex */
public class q2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342969d = 0;

    public q2(fe0.r2 r2Var, fe0.p2 p2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342969d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342969d;
        this.f342969d = i17 + 1;
        if (i17 == 0) {
            return ee0.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
