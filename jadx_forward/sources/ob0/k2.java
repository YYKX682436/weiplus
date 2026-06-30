package ob0;

/* loaded from: classes6.dex */
public class k2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425453d = 0;

    public k2(ob0.l2 l2Var, ob0.j2 j2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425453d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425453d;
        this.f425453d = i17 + 1;
        if (i17 == 0) {
            return cr0.a7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
