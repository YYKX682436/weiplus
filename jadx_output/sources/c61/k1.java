package c61;

/* loaded from: classes6.dex */
public class k1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39083d = 0;

    public k1(c61.l1 l1Var, c61.j1 j1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39083d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39083d;
        this.f39083d = i17 + 1;
        if (i17 == 0) {
            return b92.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
