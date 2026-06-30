package qs;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f447683d = 0;

    public d1(qs.e1 e1Var, qs.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f447683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f447683d;
        this.f447683d = i17 + 1;
        if (i17 == 0) {
            return qs.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
