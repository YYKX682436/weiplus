package qb2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442792d = 0;

    public n(qb2.o oVar, qb2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442792d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442792d;
        this.f442792d = i17 + 1;
        if (i17 == 0) {
            return qb2.a2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
