package qg0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444269d = 0;

    public n(qg0.o oVar, qg0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444269d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444269d;
        this.f444269d = i17 + 1;
        if (i17 == 0) {
            return pg0.n3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
