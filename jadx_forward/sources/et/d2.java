package et;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337981d = 0;

    public d2(et.e2 e2Var, et.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337981d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337981d;
        this.f337981d = i17 + 1;
        if (i17 == 0) {
            return et.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
