package f01;

/* loaded from: classes6.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339928d = 0;

    public u0(f01.v0 v0Var, f01.t0 t0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339928d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339928d;
        this.f339928d = i17 + 1;
        if (i17 == 0) {
            return f01.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
