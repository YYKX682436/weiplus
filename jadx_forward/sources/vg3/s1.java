package vg3;

/* loaded from: classes6.dex */
public class s1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518285d = 0;

    public s1(vg3.t1 t1Var, vg3.r1 r1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518285d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518285d;
        this.f518285d = i17 + 1;
        if (i17 == 0) {
            return w11.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
