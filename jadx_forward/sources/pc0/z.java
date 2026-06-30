package pc0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434866d = 0;

    public z(pc0.a0 a0Var, pc0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434866d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434866d;
        this.f434866d = i17 + 1;
        if (i17 == 0) {
            return pc0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
