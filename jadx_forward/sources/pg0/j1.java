package pg0;

/* loaded from: classes6.dex */
public class j1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435542d = 0;

    public j1(pg0.k1 k1Var, pg0.i1 i1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435542d;
        this.f435542d = i17 + 1;
        if (i17 == 0) {
            return pg0.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
