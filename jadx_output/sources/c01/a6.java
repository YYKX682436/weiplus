package c01;

/* loaded from: classes.dex */
public class a6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37053d = 0;

    public a6(c01.b6 b6Var, c01.z5 z5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37053d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37053d;
        this.f37053d = i17 + 1;
        if (i17 == 0) {
            return c01.lb.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
