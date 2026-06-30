package so3;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492290d = 0;

    public o(so3.p pVar, so3.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492290d;
        this.f492290d = i17 + 1;
        if (i17 == 0) {
            return so3.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
