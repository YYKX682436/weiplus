package pg0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435606d = 0;

    public z(pg0.a0 a0Var, pg0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435606d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435606d;
        this.f435606d = i17 + 1;
        if (i17 == 0) {
            return pg0.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
