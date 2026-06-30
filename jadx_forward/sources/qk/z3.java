package qk;

/* loaded from: classes6.dex */
public class z3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445926d = 0;

    public z3(qk.a4 a4Var, qk.y3 y3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445926d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445926d;
        this.f445926d = i17 + 1;
        if (i17 == 0) {
            return ef0.d3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
