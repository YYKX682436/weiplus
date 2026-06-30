package et1;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338103d = 0;

    public i(et1.j jVar, et1.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338103d < 6;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338103d;
        this.f338103d = i17 + 1;
        if (i17 == 0) {
            return gi4.g.INSTANCE;
        }
        if (i17 == 1) {
            return qb2.u0.INSTANCE;
        }
        if (i17 == 2) {
            return x53.g.INSTANCE;
        }
        if (i17 == 3) {
            return jr4.k.INSTANCE;
        }
        if (i17 == 4) {
            return qy4.h.INSTANCE;
        }
        if (i17 == 5) {
            return fr1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 6");
    }
}
