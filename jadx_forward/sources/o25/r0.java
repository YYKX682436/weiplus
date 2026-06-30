package o25;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424114d = 0;

    public r0(o25.s0 s0Var, o25.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424114d;
        this.f424114d = i17 + 1;
        if (i17 == 0) {
            return r35.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
