package ab0;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2706d = 0;

    public o(ab0.p pVar, ab0.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2706d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2706d;
        this.f2706d = i17 + 1;
        if (i17 == 0) {
            return za0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
