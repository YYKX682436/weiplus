package n34;

/* loaded from: classes6.dex */
public class q0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f416241d = 0;

    public q0(n34.r0 r0Var, n34.p0 p0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f416241d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f416241d;
        this.f416241d = i17 + 1;
        if (i17 == 0) {
            return n34.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
