package zg0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554335d = 0;

    public z(zg0.a0 a0Var, zg0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554335d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554335d;
        this.f554335d = i17 + 1;
        if (i17 == 0) {
            return ez.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
