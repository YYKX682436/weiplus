package o72;

/* loaded from: classes6.dex */
public class q1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424978d = 0;

    public q1(o72.r1 r1Var, o72.p1 p1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424978d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424978d;
        this.f424978d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.fav.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
