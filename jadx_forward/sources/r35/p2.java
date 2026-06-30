package r35;

/* loaded from: classes6.dex */
public class p2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450773d = 0;

    public p2(r35.q2 q2Var, r35.o2 o2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450773d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450773d;
        this.f450773d = i17 + 1;
        if (i17 == 0) {
            return r35.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
