package rv;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481414d = 0;

    public m0(rv.n0 n0Var, rv.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481414d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481414d;
        this.f481414d = i17 + 1;
        if (i17 == 0) {
            return qv.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
