package he0;

/* loaded from: classes6.dex */
public class x1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362368d = 0;

    public x1(he0.y1 y1Var, he0.w1 w1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362368d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362368d;
        this.f362368d = i17 + 1;
        if (i17 == 0) {
            return he0.f5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
