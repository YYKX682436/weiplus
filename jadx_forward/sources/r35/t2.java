package r35;

/* loaded from: classes6.dex */
public class t2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450795d = 0;

    public t2(r35.u2 u2Var, r35.s2 s2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450795d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450795d;
        this.f450795d = i17 + 1;
        if (i17 == 0) {
            return r35.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
