package vg3;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518172d = 0;

    public a0(vg3.b0 b0Var, vg3.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518172d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518172d;
        this.f518172d = i17 + 1;
        if (i17 == 0) {
            return r01.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
