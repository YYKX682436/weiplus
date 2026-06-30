package hh4;

/* loaded from: classes5.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363009d = 0;

    public g(hh4.h hVar, hh4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363009d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363009d;
        this.f363009d = i17 + 1;
        if (i17 == 0) {
            return ll3.x1.INSTANCE;
        }
        if (i17 == 1) {
            return ah0.l2.INSTANCE;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.k.INSTANCE;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n7.INSTANCE;
        }
        if (i17 == 4) {
            return uy.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
