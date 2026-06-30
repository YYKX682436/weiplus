package rv;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f481354d = 0;

    public a0(rv.b0 b0Var, rv.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f481354d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f481354d;
        this.f481354d = i17 + 1;
        if (i17 == 0) {
            return yq1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
