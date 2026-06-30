package d11;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307196d = 0;

    public j(d11.k kVar, d11.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307196d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307196d;
        this.f307196d = i17 + 1;
        if (i17 == 0) {
            return d11.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
