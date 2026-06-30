package c00;

/* loaded from: classes6.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37017d = 0;

    public r1(c00.s1 s1Var, c00.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37017d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37017d;
        this.f37017d = i17 + 1;
        if (i17 == 0) {
            return j20.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
