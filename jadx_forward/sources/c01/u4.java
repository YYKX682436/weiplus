package c01;

/* loaded from: classes6.dex */
public class u4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f119037d = 0;

    public u4(c01.v4 v4Var, c01.t4 t4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f119037d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f119037d;
        this.f119037d = i17 + 1;
        if (i17 == 0) {
            return yv1.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
