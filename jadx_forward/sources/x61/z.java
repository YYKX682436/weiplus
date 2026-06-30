package x61;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533760d = 0;

    public z(x61.a0 a0Var, x61.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533760d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533760d;
        this.f533760d = i17 + 1;
        if (i17 == 0) {
            return x61.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
