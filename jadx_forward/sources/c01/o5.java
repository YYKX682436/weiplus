package c01;

/* loaded from: classes.dex */
public class o5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118896d = 0;

    public o5(c01.p5 p5Var, c01.n5 n5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118896d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118896d;
        this.f118896d = i17 + 1;
        if (i17 == 0) {
            return c01.v9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
