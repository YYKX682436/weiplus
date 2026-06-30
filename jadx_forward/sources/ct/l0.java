package ct;

/* loaded from: classes6.dex */
public class l0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303700d = 0;

    public l0(ct.m0 m0Var, ct.k0 k0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303700d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303700d;
        this.f303700d = i17 + 1;
        if (i17 == 0) {
            return qg5.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
