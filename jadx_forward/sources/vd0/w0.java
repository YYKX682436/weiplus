package vd0;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517061d = 0;

    public w0(vd0.x0 x0Var, vd0.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517061d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517061d;
        this.f517061d = i17 + 1;
        if (i17 == 0) {
            return vd0.m3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
