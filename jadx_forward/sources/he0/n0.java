package he0;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362296d = 0;

    public n0(he0.o0 o0Var, he0.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362296d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362296d;
        this.f362296d = i17 + 1;
        if (i17 == 0) {
            return he0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
