package f23;

/* loaded from: classes.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340617d = 0;

    public z(f23.a0 a0Var, f23.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340617d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340617d;
        this.f340617d = i17 + 1;
        if (i17 == 0) {
            return f23.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
