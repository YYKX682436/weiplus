package b00;

/* loaded from: classes6.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98332d = 0;

    public z0(b00.a1 a1Var, b00.y0 y0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98332d;
        this.f98332d = i17 + 1;
        if (i17 == 0) {
            return b00.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
