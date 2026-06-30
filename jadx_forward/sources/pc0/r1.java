package pc0;

/* loaded from: classes.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434837d = 0;

    public r1(pc0.s1 s1Var, pc0.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434837d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434837d;
        this.f434837d = i17 + 1;
        if (i17 == 0) {
            return pc0.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
