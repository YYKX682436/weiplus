package f23;

/* loaded from: classes.dex */
public class z1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340620d = 0;

    public z1(f23.a2 a2Var, f23.y1 y1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340620d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340620d;
        this.f340620d = i17 + 1;
        if (i17 == 0) {
            return f23.q3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
