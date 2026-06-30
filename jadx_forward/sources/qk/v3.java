package qk;

/* loaded from: classes6.dex */
public class v3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445880d = 0;

    public v3(qk.w3 w3Var, qk.u3 u3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445880d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445880d;
        this.f445880d = i17 + 1;
        if (i17 == 0) {
            return rk4.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
