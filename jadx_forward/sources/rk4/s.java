package rk4;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f478493d = 0;

    public s(rk4.t tVar, rk4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f478493d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f478493d;
        this.f478493d = i17 + 1;
        if (i17 == 0) {
            return rk4.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
