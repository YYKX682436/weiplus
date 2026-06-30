package rq1;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f480309d = 0;

    public r(rq1.s sVar, rq1.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f480309d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f480309d;
        this.f480309d = i17 + 1;
        if (i17 == 0) {
            return rq1.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
