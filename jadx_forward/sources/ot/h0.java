package ot;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429845d = 0;

    public h0(ot.i0 i0Var, ot.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429845d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429845d;
        this.f429845d = i17 + 1;
        if (i17 == 0) {
            return ot.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
