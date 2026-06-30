package yv1;

/* loaded from: classes6.dex */
public class s2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547692d = 0;

    public s2(yv1.t2 t2Var, yv1.r2 r2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547692d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547692d;
        this.f547692d = i17 + 1;
        if (i17 == 0) {
            return yv1.j3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
