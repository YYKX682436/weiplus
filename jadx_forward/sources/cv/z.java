package cv;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304055d = 0;

    public z(cv.a0 a0Var, cv.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304055d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304055d;
        this.f304055d = i17 + 1;
        if (i17 == 0) {
            return bv.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
