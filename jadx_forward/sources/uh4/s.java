package uh4;

/* loaded from: classes.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f509523d = 0;

    public s(uh4.t tVar, uh4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f509523d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f509523d;
        this.f509523d = i17 + 1;
        if (i17 == 0) {
            return vh4.u2.INSTANCE;
        }
        if (i17 == 1) {
            return vh4.x2.INSTANCE;
        }
        if (i17 == 2) {
            return vh4.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
