package c01;

/* loaded from: classes6.dex */
public class k5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118816d = 0;

    public k5(c01.l5 l5Var, c01.j5 j5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118816d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118816d;
        this.f118816d = i17 + 1;
        if (i17 == 0) {
            return fn1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
