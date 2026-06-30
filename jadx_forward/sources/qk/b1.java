package qk;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445551d = 0;

    public b1(qk.c1 c1Var, qk.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445551d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445551d;
        this.f445551d = i17 + 1;
        if (i17 == 0) {
            return c01.o0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
