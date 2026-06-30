package c30;

/* loaded from: classes6.dex */
public class j0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38139d = 0;

    public j0(c30.k0 k0Var, c30.i0 i0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38139d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38139d;
        this.f38139d = i17 + 1;
        if (i17 == 0) {
            return c30.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
