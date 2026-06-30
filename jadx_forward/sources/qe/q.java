package qe;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443519d = 0;

    public q(qe.r rVar, qe.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443519d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443519d;
        this.f443519d = i17 + 1;
        if (i17 == 0) {
            return yc1.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
