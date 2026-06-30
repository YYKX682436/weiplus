package aq1;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13029d = 0;

    public b0(aq1.c0 c0Var, aq1.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13029d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13029d;
        this.f13029d = i17 + 1;
        if (i17 == 0) {
            return aq1.r1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
