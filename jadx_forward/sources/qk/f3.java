package qk;

/* loaded from: classes6.dex */
public class f3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445638d = 0;

    public f3(qk.g3 g3Var, qk.e3 e3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445638d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445638d;
        this.f445638d = i17 + 1;
        if (i17 == 0) {
            return rk4.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
