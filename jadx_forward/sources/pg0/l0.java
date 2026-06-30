package pg0;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435550d = 0;

    public l0(pg0.m0 m0Var, pg0.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435550d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435550d;
        this.f435550d = i17 + 1;
        if (i17 == 0) {
            return pg0.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
