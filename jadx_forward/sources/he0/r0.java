package he0;

/* loaded from: classes6.dex */
public class r0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362326d = 0;

    public r0(he0.s0 s0Var, he0.q0 q0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362326d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362326d;
        this.f362326d = i17 + 1;
        if (i17 == 0) {
            return he0.o4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
