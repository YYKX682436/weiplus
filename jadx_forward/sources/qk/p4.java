package qk;

/* loaded from: classes6.dex */
public class p4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445842d = 0;

    public p4(qk.q4 q4Var, qk.o4 o4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445842d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445842d;
        this.f445842d = i17 + 1;
        if (i17 == 0) {
            return ef0.k3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
