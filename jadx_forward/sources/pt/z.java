package pt;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439718d = 0;

    public z(pt.a0 a0Var, pt.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439718d;
        this.f439718d = i17 + 1;
        if (i17 == 0) {
            return ot.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
