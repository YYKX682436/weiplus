package c61;

/* loaded from: classes6.dex */
public class y0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120949d = 0;

    public y0(c61.z0 z0Var, c61.x0 x0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120949d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120949d;
        this.f120949d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
