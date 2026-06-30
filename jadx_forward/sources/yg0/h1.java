package yg0;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543721d = 0;

    public h1(yg0.i1 i1Var, yg0.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543721d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543721d;
        this.f543721d = i17 + 1;
        if (i17 == 0) {
            return yg0.f4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
