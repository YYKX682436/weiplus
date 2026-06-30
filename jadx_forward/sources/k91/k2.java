package k91;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387192d = 0;

    public k2(k91.l2 l2Var, k91.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387192d;
        this.f387192d = i17 + 1;
        if (i17 == 0) {
            return k91.k3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
