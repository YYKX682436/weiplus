package vg3;

/* loaded from: classes.dex */
public class u2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518293d = 0;

    public u2(vg3.v2 v2Var, vg3.t2 t2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518293d < 3;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518293d;
        this.f518293d = i17 + 1;
        if (i17 == 0) {
            return du4.g.INSTANCE;
        }
        if (i17 == 1) {
            return h13.p0.INSTANCE;
        }
        if (i17 == 2) {
            return jy4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 3");
    }
}
