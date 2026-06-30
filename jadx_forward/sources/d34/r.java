package d34;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307861d = 0;

    public r(d34.s sVar, d34.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307861d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307861d;
        this.f307861d = i17 + 1;
        if (i17 == 0) {
            return d34.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
