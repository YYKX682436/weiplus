package zv1;

/* loaded from: classes6.dex */
public class s0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f557912d = 0;

    public s0(zv1.t0 t0Var, zv1.r0 r0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f557912d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f557912d;
        this.f557912d = i17 + 1;
        if (i17 == 0) {
            return yv1.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
