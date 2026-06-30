package r21;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450327d = 0;

    public o(r21.p pVar, r21.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450327d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450327d;
        this.f450327d = i17 + 1;
        if (i17 == 0) {
            return r21.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
