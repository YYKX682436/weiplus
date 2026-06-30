package f21;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340480d = 0;

    public r(f21.s sVar, f21.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340480d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340480d;
        this.f340480d = i17 + 1;
        if (i17 == 0) {
            return f21.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
