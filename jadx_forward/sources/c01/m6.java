package c01;

/* loaded from: classes.dex */
public class m6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118862d = 0;

    public m6(c01.n6 n6Var, c01.l6 l6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118862d;
        this.f118862d = i17 + 1;
        if (i17 == 0) {
            return c01.dd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
