package he0;

/* loaded from: classes6.dex */
public class t1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362341d = 0;

    public t1(he0.u1 u1Var, he0.s1 s1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362341d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362341d;
        this.f362341d = i17 + 1;
        if (i17 == 0) {
            return he0.d5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
