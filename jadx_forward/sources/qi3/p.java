package qi3;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445288d = 0;

    public p(qi3.q qVar, qi3.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445288d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445288d;
        this.f445288d = i17 + 1;
        if (i17 == 0) {
            return jm.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
