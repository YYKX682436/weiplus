package en3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336851d = 0;

    public n(en3.o oVar, en3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336851d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336851d;
        this.f336851d = i17 + 1;
        if (i17 == 0) {
            return en3.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
