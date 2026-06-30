package on;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428291d = 0;

    public z(on.a0 a0Var, on.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428291d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428291d;
        this.f428291d = i17 + 1;
        if (i17 == 0) {
            return on.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
