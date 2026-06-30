package c00;

/* loaded from: classes6.dex */
public class n1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118536d = 0;

    public n1(c00.o1 o1Var, c00.m1 m1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118536d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118536d;
        this.f118536d = i17 + 1;
        if (i17 == 0) {
            return g20.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
