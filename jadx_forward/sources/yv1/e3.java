package yv1;

/* loaded from: classes6.dex */
public class e3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f547555d = 0;

    public e3(yv1.f3 f3Var, yv1.d3 d3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f547555d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f547555d;
        this.f547555d = i17 + 1;
        if (i17 == 0) {
            return yv1.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
