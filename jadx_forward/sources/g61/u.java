package g61;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350601d = 0;

    public u(g61.v vVar, g61.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350601d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350601d;
        this.f350601d = i17 + 1;
        if (i17 == 0) {
            return g61.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
