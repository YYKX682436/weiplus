package z71;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552076d = 0;

    public u(z71.v vVar, z71.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552076d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552076d;
        this.f552076d = i17 + 1;
        if (i17 == 0) {
            return z71.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
