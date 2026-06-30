package k91;

/* loaded from: classes6.dex */
public class o2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387235d = 0;

    public o2(k91.p2 p2Var, k91.n2 n2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387235d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387235d;
        this.f387235d = i17 + 1;
        if (i17 == 0) {
            return k91.i4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
