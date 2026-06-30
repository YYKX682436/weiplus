package oo2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428707d = 0;

    public n(oo2.o oVar, oo2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428707d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428707d;
        this.f428707d = i17 + 1;
        if (i17 == 0) {
            return oo2.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
