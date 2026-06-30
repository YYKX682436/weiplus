package ft;

/* loaded from: classes6.dex */
public class q3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f347957d = 0;

    public q3(ft.r3 r3Var, ft.p3 p3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f347957d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f347957d;
        this.f347957d = i17 + 1;
        if (i17 == 0) {
            return xc1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
