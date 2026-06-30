package vg3;

/* loaded from: classes6.dex */
public class c3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518211d = 0;

    public c3(vg3.d3 d3Var, vg3.b3 b3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518211d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518211d;
        this.f518211d = i17 + 1;
        if (i17 == 0) {
            return so3.e.INSTANCE;
        }
        if (i17 == 1) {
            return ic2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
