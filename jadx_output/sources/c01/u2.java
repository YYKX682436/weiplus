package c01;

/* loaded from: classes6.dex */
public class u2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37501d = 0;

    public u2(c01.v2 v2Var, c01.t2 t2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37501d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37501d;
        this.f37501d = i17 + 1;
        if (i17 == 0) {
            return c01.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
