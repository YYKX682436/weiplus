package bi4;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f21072d = 0;

    public o(bi4.p pVar, bi4.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21072d;
        this.f21072d = i17 + 1;
        if (i17 == 0) {
            return ki4.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
