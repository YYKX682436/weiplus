package ob0;

/* loaded from: classes6.dex */
public class i1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425445d = 0;

    public i1(ob0.j1 j1Var, ob0.h1 h1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425445d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425445d;
        this.f425445d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
