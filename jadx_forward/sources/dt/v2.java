package dt;

/* loaded from: classes6.dex */
public class v2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324620d = 0;

    public v2(dt.w2 w2Var, dt.u2 u2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324620d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324620d;
        this.f324620d = i17 + 1;
        if (i17 == 0) {
            return dt.p5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
