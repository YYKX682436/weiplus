package he0;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362314d = 0;

    public p1(he0.q1 q1Var, he0.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362314d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362314d;
        this.f362314d = i17 + 1;
        if (i17 == 0) {
            return he0.a5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
