package fk5;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345201d = 0;

    public n(fk5.o oVar, fk5.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345201d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345201d;
        this.f345201d = i17 + 1;
        if (i17 == 0) {
            return fk5.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
