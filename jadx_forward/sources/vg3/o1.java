package vg3;

/* loaded from: classes6.dex */
public class o1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518273d = 0;

    public o1(vg3.p1 p1Var, vg3.n1 n1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518273d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518273d;
        this.f518273d = i17 + 1;
        if (i17 == 0) {
            return y04.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
