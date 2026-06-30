package he0;

/* loaded from: classes6.dex */
public class r2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362329d = 0;

    public r2(he0.s2 s2Var, he0.q2 q2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362329d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362329d;
        this.f362329d = i17 + 1;
        if (i17 == 0) {
            return he0.r5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
