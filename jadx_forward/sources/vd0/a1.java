package vd0;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f516898d = 0;

    public a1(vd0.b1 b1Var, vd0.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f516898d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f516898d;
        this.f516898d = i17 + 1;
        if (i17 == 0) {
            return vd0.p3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
