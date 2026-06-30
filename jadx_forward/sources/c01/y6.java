package c01;

/* loaded from: classes.dex */
public class y6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119106d = 0;

    public y6(c01.z6 z6Var, c01.x6 x6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119106d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119106d;
        this.f119106d = i17 + 1;
        if (i17 == 0) {
            return c01.gd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
