package qk;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445601d = 0;

    public d2(qk.e2 e2Var, qk.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445601d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445601d;
        this.f445601d = i17 + 1;
        if (i17 == 0) {
            return hs.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
