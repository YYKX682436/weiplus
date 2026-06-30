package qk;

/* loaded from: classes6.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445853d = 0;

    public r1(qk.s1 s1Var, qk.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445853d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445853d;
        this.f445853d = i17 + 1;
        if (i17 == 0) {
            return vw.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
