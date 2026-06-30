package ed0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332766d = 0;

    public z(ed0.a0 a0Var, ed0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332766d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332766d;
        this.f332766d = i17 + 1;
        if (i17 == 0) {
            return dd0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
