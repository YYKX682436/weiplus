package uh4;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f509520d = 0;

    public o(uh4.p pVar, uh4.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f509520d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f509520d;
        this.f509520d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.r1.INSTANCE;
        }
        if (i17 == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.d.INSTANCE;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.u1.INSTANCE;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o1.INSTANCE;
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
