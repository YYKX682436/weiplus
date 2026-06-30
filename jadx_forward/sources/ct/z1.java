package ct;

/* loaded from: classes6.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303736d = 0;

    public z1(ct.a2 a2Var, ct.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303736d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303736d;
        this.f303736d = i17 + 1;
        if (i17 == 0) {
            return bt.s1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
