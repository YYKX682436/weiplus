package b00;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98281d = 0;

    public p1(b00.q1 q1Var, b00.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98281d;
        this.f98281d = i17 + 1;
        if (i17 == 0) {
            return b00.n2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
