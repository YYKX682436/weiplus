package ll3;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f400796d = 0;

    public z(ll3.a0 a0Var, ll3.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f400796d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f400796d;
        this.f400796d = i17 + 1;
        if (i17 == 0) {
            return ll3.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
