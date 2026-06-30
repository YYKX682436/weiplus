package b00;

/* loaded from: classes6.dex */
public class x1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f16790d = 0;

    public x1(b00.y1 y1Var, b00.w1 w1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f16790d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f16790d;
        this.f16790d = i17 + 1;
        if (i17 == 0) {
            return b00.u2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
