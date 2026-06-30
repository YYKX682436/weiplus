package kh;

/* loaded from: classes6.dex */
public class k0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389370d = 0;

    public k0(kh.l0 l0Var, kh.j0 j0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389370d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389370d;
        this.f389370d = i17 + 1;
        if (i17 == 0) {
            return kh.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
