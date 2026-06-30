package et;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338055d = 0;

    public z(et.a0 a0Var, et.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338055d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338055d;
        this.f338055d = i17 + 1;
        if (i17 == 0) {
            return et.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
