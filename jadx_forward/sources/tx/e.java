package tx;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f504029d = 0;

    public e(tx.f fVar, tx.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f504029d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f504029d;
        this.f504029d = i17 + 1;
        if (i17 == 0) {
            return tx.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
