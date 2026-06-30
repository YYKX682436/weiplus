package yv1;

/* loaded from: classes6.dex */
public class a3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547528d = 0;

    public a3(yv1.b3 b3Var, yv1.z2 z2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547528d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547528d;
        this.f547528d = i17 + 1;
        if (i17 == 0) {
            return yv1.r3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
