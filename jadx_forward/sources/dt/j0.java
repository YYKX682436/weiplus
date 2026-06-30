package dt;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324534d = 0;

    public j0(dt.k0 k0Var, dt.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324534d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324534d;
        this.f324534d = i17 + 1;
        if (i17 == 0) {
            return dt.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
