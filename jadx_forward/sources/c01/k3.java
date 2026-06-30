package c01;

/* loaded from: classes6.dex */
public class k3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118813d = 0;

    public k3(c01.l3 l3Var, c01.j3 j3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118813d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118813d;
        this.f118813d = i17 + 1;
        if (i17 == 0) {
            return c01.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
