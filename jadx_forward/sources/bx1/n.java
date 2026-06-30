package bx1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f117839d = 0;

    public n(bx1.o oVar, bx1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f117839d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f117839d;
        this.f117839d = i17 + 1;
        if (i17 == 0) {
            return fq3.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
