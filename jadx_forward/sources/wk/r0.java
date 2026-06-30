package wk;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f528435d = 0;

    public r0(wk.s0 s0Var, wk.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f528435d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f528435d;
        this.f528435d = i17 + 1;
        if (i17 == 0) {
            return wk.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
