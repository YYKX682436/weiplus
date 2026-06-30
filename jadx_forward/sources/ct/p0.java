package ct;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303712d = 0;

    public p0(ct.q0 q0Var, ct.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303712d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303712d;
        this.f303712d = i17 + 1;
        if (i17 == 0) {
            return qg5.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
