package fe0;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342990d = 0;

    public y0(fe0.z0 z0Var, fe0.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342990d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342990d;
        this.f342990d = i17 + 1;
        if (i17 == 0) {
            return ee0.a4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
