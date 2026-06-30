package ab1;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2735d = 0;

    public o(ab1.p pVar, ab1.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2735d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2735d;
        this.f2735d = i17 + 1;
        if (i17 == 0) {
            return ab1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
