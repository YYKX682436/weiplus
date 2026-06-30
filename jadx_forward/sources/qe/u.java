package qe;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443526d = 0;

    public u(qe.v vVar, qe.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443526d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443526d;
        this.f443526d = i17 + 1;
        if (i17 == 0) {
            return yc1.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
