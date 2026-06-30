package c50;

/* loaded from: classes6.dex */
public class i0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120139d = 0;

    public i0(c50.j0 j0Var, c50.h0 h0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120139d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120139d;
        this.f120139d = i17 + 1;
        if (i17 == 0) {
            return ml2.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
