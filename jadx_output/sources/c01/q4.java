package c01;

/* loaded from: classes6.dex */
public class q4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37390d = 0;

    public q4(c01.r4 r4Var, c01.p4 p4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37390d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37390d;
        this.f37390d = i17 + 1;
        if (i17 == 0) {
            return yv1.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
