package c01;

/* loaded from: classes.dex */
public class a4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37050d = 0;

    public a4(c01.b4 b4Var, c01.z3 z3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37050d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37050d;
        this.f37050d = i17 + 1;
        if (i17 == 0) {
            return c01.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
