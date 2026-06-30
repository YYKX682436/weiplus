package br1;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f23594d = 0;

    public a0(br1.b0 b0Var, br1.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23594d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f23594d;
        this.f23594d = i17 + 1;
        if (i17 == 0) {
            return br1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
