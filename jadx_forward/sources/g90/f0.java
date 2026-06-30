package g90;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f351217d = 0;

    public f0(g90.g0 g0Var, g90.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f351217d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f351217d;
        this.f351217d = i17 + 1;
        if (i17 == 0) {
            return g90.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
