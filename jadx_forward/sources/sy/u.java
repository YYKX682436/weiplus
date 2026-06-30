package sy;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f495353d = 0;

    public u(sy.v vVar, sy.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f495353d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f495353d;
        this.f495353d = i17 + 1;
        if (i17 == 0) {
            return sy.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
