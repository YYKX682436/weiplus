package dt;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324606d = 0;

    public t1(dt.u1 u1Var, dt.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324606d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324606d;
        this.f324606d = i17 + 1;
        if (i17 == 0) {
            return dt.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
