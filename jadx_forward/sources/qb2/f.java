package qb2;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442737d = 0;

    public f(qb2.g gVar, qb2.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442737d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442737d;
        this.f442737d = i17 + 1;
        if (i17 == 0) {
            return qb2.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
